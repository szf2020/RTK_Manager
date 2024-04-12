package com.app.rtk_manager;

import java.util.HashMap;
import java.util.Map;

import com.fazecast.jSerialComm.SerialPort;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    public TextField ipAddress,udpPort;
    @FXML
    private TextField surveyAcc,surveyTime;
    @FXML
    private ChoiceBox<String> serial1,serial2;
    @FXML
    private ChoiceBox<Integer> baudrate1,baudrate2;
    @FXML
    private CheckBox dataCheckBox,dataCheckBox2;
    @FXML
    private Button startButton;
    @FXML
    private Label dataLabel;
    @FXML
    private ImageView btn_settings,btn_status,btn_graph,btn_exit,btn_restart;
    @FXML
    private AnchorPane h_settings,h_status,h_graph;
    private boolean topBarVisible = true;
    private DataRequest dataRequest = new DataRequest();
    private Thread backgroundThread;
    private boolean isRunning = false;
    private boolean isComportBaudrateDisabled = false;
    private boolean isComportBaudrateDisabled2 = false;
    private MouseEvent event;
    // 매핑을 위한 장치 이름과 시스템 포트 이름의 맵
    private Map<String, String> deviceToSystemPortMap = new HashMap<>();


    @FXML
    private void handleButtonAction(MouseEvent event) {
        this.event = event;
        if (event.getTarget() == btn_settings) {
            h_settings.setVisible(true);
            h_status.setVisible(false);
            h_graph.setVisible(false);
            topBarVisible = false;
        } else if (event.getTarget() == btn_status) {
            h_settings.setVisible(false);
            h_status.setVisible(true);
            h_graph.setVisible(false);
            topBarVisible = false;
        } else if (event.getTarget() == btn_graph) {
            h_settings.setVisible(false);
            h_status.setVisible(false);
            h_graph.setVisible(true);
            topBarVisible = false;
        } else if (event.getTarget() == btn_exit) {
            if (!topBarVisible) {
                h_settings.setVisible(false);
                h_status.setVisible(false);
                h_graph.setVisible(false);
                topBarVisible = true;
            } else {
                Platform.exit();
            }
        }
        else if (event.getTarget() == btn_restart) {

            // surveyAcc와 surveyTime 값을 읽어옴
            String accText = surveyAcc.getText();
            String timeText = surveyTime.getText();
            double  surveyAccValue = Double.parseDouble(accText);
//            float surveyAccValue = Float.parseFloat(accText);

            int surveyTimeValue = Integer.parseInt(timeText);

            // surveyTimeValue와 surveyAccFixedPoint 값을 CommandFactory에 설정
            CommandFactory.surveyAccValue = surveyAccValue;
            CommandFactory.surveyTimeValue = surveyTimeValue;

            // RequestSurveyin 메소드 호출하여 요청 데이터 출력
            dataRequest.sendRequestSurveyin();
          //  System.out.println("surveyAccValue: " + surveyAccValue);
            for (byte b : CommandFactory.RequestSurveyin()) {
                System.out.printf("%02X ", b);
            }
            System.out.println(" ");
            System.out.printf("set SurveyinAcc : %.1f  time : %d\n",surveyAccValue,surveyTimeValue);


        }
        }

    @FXML
    private void initialize() {
        initializeSerialPorts();
        initializeBaudrates();
        h_settings.setVisible(false);
        h_status.setVisible(false);
        h_graph.setVisible(false);


        startButton.setOnAction(event -> onStartButtonClick());

        // dataCheckBox에 대한 리스너 추가
        dataCheckBox.setOnAction(event -> {
            if (dataCheckBox.isSelected()) {
                serial2.setDisable(true);
                baudrate2.setDisable(true);
                // serial2와 baudrate2가 선택되었는지 확인
                String selectedSerial2 = serial2.getValue();
                Integer selectedBaudrate2 = baudrate2.getValue();
                if (selectedSerial2 != null && selectedBaudrate2 != null) {
                    // serial2와 baudrate2가 모두 선택된 경우 mavlinkStream을 초기화
                    selectedBaudrate2 = selectedBaudrate2.intValue();
                    initializeMavlinkStream(selectedSerial2, selectedBaudrate2);
                    if (dataCheckBox.isSelected() && dataRequest.mavlinkStream != null) {
                        dataRequest.sinkFlag = dataRequest.sinkFlag | 0b00000001;
                    }
                } else {
                    // serial2 또는 baudrate2가 선택되지 않은 경우 사용자에게 선택하도록 안내
                    System.out.println("Please select Serial2 and Baudrate2.");
                    dataCheckBox.setSelected(false); // 체크박스 해제
                }
            } else {
                // 체크박스가 선택 해제될 때 serial2와 baudrate2의 비활성화를 다시 활성화로 변경
                serial2.setDisable(false);
                baudrate2.setDisable(false);
                // sinkFlag를 0으로 설정하여 데이터 전송 중지
                dataRequest.sinkFlag = 0;
            }
        });
        // dataCheckBox2에 대한 리스너 추가
        dataCheckBox2.setOnAction(event -> {
            if (dataCheckBox2.isSelected()) {
                // ipAddress와 udpPort 값 설정
                String ip = ipAddress.getText();
                int portNum = Integer.parseInt(udpPort.getText());
                dataRequest.mavlinkStream.setIpAddressAndPort(ip, portNum);

                if(dataCheckBox2.isSelected() && dataRequest.mavlinkStream != null){
                    dataRequest.sinkFlag = dataRequest.sinkFlag | 0b00000010;
                }
            }
        });
    }

    private void initializeSerialPorts() {
        ObservableList<String> portList = FXCollections.observableArrayList();
        SerialPort[] serialPorts = SerialPort.getCommPorts();

        // 시리얼 포트의 장치 이름과 시스템 포트 이름을 매핑하여 저장
        for (SerialPort port : serialPorts) {
            String descriptivePortName = port.getPortDescription();
            String descriptivePortNumber = port.getSystemPortName();
            String systemPortName = port.getSystemPortName();
            portList.add(descriptivePortName+"("+ descriptivePortNumber +")");
            deviceToSystemPortMap.put(descriptivePortName+"("+ descriptivePortNumber +")", systemPortName);
        }
        serial1.setItems(portList);
        serial2.setItems(portList);
    }

    private void initializeDataRequest(String selectedDevice, int selectedBaudrate) {
        // 장치 이름에 대응하는 시스템 포트 이름을 가져옴
        String systemPortName = deviceToSystemPortMap.get(selectedDevice);
        dataRequest.setSerialport(systemPortName, selectedBaudrate);
    }

    private void initializeMavlinkStream(String selectedDevice, int selectedBaudrate) {
        // 장치 이름에 대응하는 시스템 포트 이름을 가져옴
        String systemPortName = deviceToSystemPortMap.get(selectedDevice);
        dataRequest.mavlinkStream.setSerialport(systemPortName, selectedBaudrate);
    }

    private void initializeBaudrates() {
        baudrate1.getItems().addAll(null,9600, 115200);
        baudrate2.getItems().addAll(null,9600, 115200);
    }

    private void onStartButtonClick()  {
        if (isRunning) {
            stopBackgroundThread();
        } else {
            String selectedSerial1 = serial1.getValue();
            Integer selectedBaudrate1 = baudrate1.getValue();

            if (selectedSerial1 != null && selectedBaudrate1 != null) {
                selectedBaudrate1 = selectedBaudrate1.intValue();
                initializeDataRequest(selectedSerial1, selectedBaudrate1);

                dataRequest.sendRTCM();
                dataRequest.sendSurveyin();

                startBackgroundThread(isRunning);

            } else {
                System.out.println("Please select Serial and Baudrate.");
            }
        }
        isRunning = !isRunning;

        if (!isComportBaudrateDisabled) {
            // comport와 baudrate 칸들을 비활성화한다.
            serial1.setDisable(true);
            baudrate1.setDisable(true);
            isComportBaudrateDisabled = true;
            startButton.setText("Stop");
        } else {
            // comport와 baudrate 칸들을 다시 활성화한다.
            serial1.setDisable(false);
            baudrate1.setDisable(false);
            isComportBaudrateDisabled = false;
            startButton.setText("Start");
        }
    }
    private void startBackgroundThread(boolean includeData) {
        backgroundThread = new Thread(() -> {
            try {
                while (isRunning) {
                    String receivedData = dataRequest.readData();
                  //  Platform.runLater(() -> dataLabel.setText(receivedData));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Exception e) {
               e.printStackTrace();
            }
        });
        backgroundThread.setDaemon(true);
        backgroundThread.start();
    }

    private void stopBackgroundThread() {
        if (backgroundThread != null && backgroundThread.isAlive()) {
            backgroundThread.interrupt();
            dataRequest.closePort();
        }
    }
}