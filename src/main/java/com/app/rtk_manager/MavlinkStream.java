package com.app.rtk_manager;

import com.fazecast.jSerialComm.SerialPort;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.common.msg_gps_rtcm_data;

import static com.MAVLink.common.msg_gps_rtcm_data.MAVLINK_MSG_LENGTH;

public class MavlinkStream {

    private static StringBuilder incompleteRtcmData;
    private byte[] mavlinkpacket;
    private SerialPort comPort2;
    private short _sequenceId = 0; // 시퀀스 ID를 클래스 변수로 변경
    private byte mavMsg = 0;


    public MavlinkStream() {
        MavlinkStream.setIncompleteRtcmData(new StringBuilder());
    }

    public void setSerialport(String selectedSerial2, int selectedBaudrate2) {
        try {
            this.comPort2 = SerialPort.getCommPort(selectedSerial2);
            this.comPort2.setBaudRate(selectedBaudrate2);

            if (comPort2.openPort()) {
                System.out.println("Serial2 port successfully opened.");
            } else {
                System.err.println("Error opening the serial2 port.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error creating SerialPort: " + e.getMessage());
        }
    }

    public void processIncomingData(byte[] rtcmData) {
        try {
            // msg_gps_rtcm_data 클래스의 인스턴스 생성
            msg_gps_rtcm_data rtcmMessage = new msg_gps_rtcm_data();

            short receivedLen = (short) rtcmData.length; // RTCM 데이터의 길이를 설정

            rtcmMessage.flags |= (short) (((_sequenceId % 255) & 0x1F) << 3);
//            int sequenceNumber = _sequenceId;
//            sequenceNumber = (sequenceNumber % 255);
//
//            rtcmMessage.flags |= ((sequenceNumber & 0x1F) << 3);  // Set bits 3-7 with new sequence number (masked to 5 bits)

            rtcmMessage.len = receivedLen;
            rtcmMessage.data = new short[rtcmData.length]; // 바이트 배열을 short 배열로 변환

            // 바이트 배열을 short 배열로 변환
            for (int i = 0; i < rtcmData.length; i++) {

                rtcmMessage.data[i] = (short) (rtcmData[i] & 0xFF); // 부호 확장을 피하기 위해 0xFF와의 비트 AND 연산을 수행
               // System.out.printf("%02X ", rtcmMessage.data[i]);
            }
            // D3 00 04 4C E0 00 80 ED ED D6

            rtcmMessage.sysid = 0;
            rtcmMessage.compid = 0;
            rtcmMessage.isMavlink2 = false;

            // 위 변수 페이로드 패킹한다
            MAVLinkPacket payloadPacket = rtcmMessage.pack();

            // MAVLinkPacket 출력 시 패킷 내용을 확인할 수 있도록 수정
            System.out.println("mavlink unpacking complete : " + payloadPacket.unpack());
//            System.out.println("mavlink 팩킹 완료 : " + payloadPacket.encodePacket());
            // MAVLINK_MSG_ID_GPS_RTCM_DATA - sysid:0 compid:0 flags:0 len:10 data:D300044CE00080EDEDD6

            _sequenceId++;
            mavlinkpacket = payloadPacket.encodePacket();
            payloadPacket.seq = mavMsg++;

            // FD 0C 00 00 00 00 00 E9 00 00 00 0A D3 00 04 4C E0 00 80 ED ED D6 7D 1D
            //MavpacketDatatoLora(payloadPacket.encodePacket());
            for (byte b : payloadPacket.encodePacket()) {
                System.out.printf("%02X ", b);
            }
            System.out.println(" ");

        } catch (Exception e) {
            handleException("Error processing incoming data.", e);
        }
    }

    public void MavpacketDatatoLora() {
        try {
            if(isSerialPortOpen()) {
                int bytesWritten = comPort2.writeBytes(mavlinkpacket, mavlinkpacket.length);
                System.out.printf("LoRA data transmission complete :"+ " "+bytesWritten+"\t");
//                for (byte b : mavlinkpacket) {
//                    System.out.printf("%02X ", b);
//                }
            }
        }catch (Exception e) {
            handleException("Lora transmission error occurred.", e);
        }
    }

    private boolean isSerialPortOpen() {
        return comPort2 != null && comPort2.isOpen();
    }

    private static void handleException(String message, Exception e) {
        e.printStackTrace();
        System.err.println(message + ": " + e.getMessage());
    }

    public static void setIncompleteRtcmData(StringBuilder incompleteRtcmData) {
        MavlinkStream.incompleteRtcmData = incompleteRtcmData;
    }
    }
