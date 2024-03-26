package com.app.rtk_manager;

import com.fazecast.jSerialComm.SerialPort;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.common.msg_gps_rtcm_data;
import java.net.*;

public class MavlinkStream {


    private byte[] mavlinkpacket;
    private SerialPort comPort2;
    private short _sequenceId = 0; // 시퀀스 ID를 클래스 변수로 변경
    private byte mavMsg = 0;
    private DatagramSocket udpSocket;
    private InetAddress ipAddress;
    private int port;

    public MavlinkStream() {
        try {
            this.udpSocket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
            System.err.println("Error creating UDP socket: " + e.getMessage());
        }
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

            int MAVLINK_MSG_LENGTH = 180;

            if (rtcmData.length < MAVLINK_MSG_LENGTH) {
                short receivedLen = (short) rtcmData.length; // RTCM 데이터의 길이를 설정

                rtcmMessage.flags |= (short) (((_sequenceId % 255) & 0x1F) << 3);
//            int sequenceNumber = _sequenceId;
//            sequenceNumber = (sequenceNumber % 255);
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
            } else {
                int fragmentId = 0;
                // 시작 위치
                int start = 0;
                while (start < rtcmData.length) {
                    int length = Math.min(rtcmData.length - start, MAVLINK_MSG_LENGTH);

                    // 플래그 설정
                    rtcmMessage.flags = 1; // LSB = 1: 메시지 조각화됨
                    rtcmMessage.flags |= (fragmentId++ << 1); // 다음 2비트: 프래그먼트 ID
                    rtcmMessage.flags |= (_sequenceId & 0x1F) << 3; // 다음 5비트: 시퀀스 ID

                    // 조각 길이 설정
                    rtcmMessage.len = (short) length;

                    rtcmMessage.data = new short[rtcmData.length]; // 바이트 배열을 short 배열로 변환

                    // 바이트 배열을 short 배열로 변환
                    for (int i = 0; i < rtcmData.length; i++) {

                        rtcmMessage.data[i] = (short) (rtcmData[i] & 0xFF); // 부호 확장을 피하기 위해 0xFF와의 비트 AND 연산을 수행

                    }

                    rtcmMessage.sysid = 0;
                    rtcmMessage.compid = 0;
                    rtcmMessage.isMavlink2 = false;

                }
            }
            // 위 변수 페이로드 패킹한다
            MAVLinkPacket payloadPacket = rtcmMessage.pack();

            // MAVLinkPacket 출력 시 패킷 내용을 확인할 수 있도록 수정
            System.out.println("mavlink unpacking complete : " + payloadPacket.unpack());
//            System.out.println("mavlink 팩킹 완료 : " + payloadPacket.encodePacket());
            // MAVLINK_MSG_ID_GPS_RTCM_DATA - sysid:0 compid:0 flags:0 len:10 data:D300044CE00080EDEDD6

            _sequenceId++;
            payloadPacket.seq = mavMsg++;
            mavlinkpacket = payloadPacket.encodePacket();


            // FD 0C 00 00 00 00 00 E9 00 00 00 0A D3 00 04 4C E0 00 80 ED ED D6 7D 1D
            for (byte b : payloadPacket.encodePacket()) {
                System.out.printf("%02X ", b);
            }
            System.out.println(" ");

        } catch (Exception e) {
            handleException("Error processing incoming data.", e);
        }
    }


    // IP 주소와 포트 설정
    public void setIpAddressAndPort(String ipAddress, int port) {
        try {
            this.ipAddress = InetAddress.getByName(ipAddress);
            this.port = port;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.err.println("Error setting IP address and port: " + e.getMessage());
        }
    }
    //시리얼을 통해 LoRA패킷 데이터 전송
    public void sendToLora() {
        try {
            if (isSerialPortOpen()) {
                int bytesWritten = comPort2.writeBytes(mavlinkpacket, mavlinkpacket.length);
                System.out.printf("LoRA data transmission complete :" + " " + bytesWritten + "\n");
//                for (byte b : mavlinkpacket) {
//                    System.out.printf("%02X ", b);
//                }
            }
        } catch (Exception e) {
            handleException("Lora transmission error occurred.", e);
        }
    }

    //IP주소와 포트를 통해 UDP패킷 데이터 전송
    public void sendToUDP() {
        try {
            DatagramPacket packet = new DatagramPacket(mavlinkpacket, mavlinkpacket.length, ipAddress, port);
            udpSocket.send(packet);
            System.out.printf("Mavlink data sent successfully UDP. => Host IP : " + ipAddress + "\t" + "Port :" + port + "\n");
            System.out.println("UDP Packet : " + mavlinkpacket.length);
//            for (byte b : mavlinkpacket) {
//                    System.out.printf("%02X ", b);
//                }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to send to UDP socket");
        }
    }


    private boolean isSerialPortOpen() {
        return comPort2 != null && comPort2.isOpen();
    }

    private static void handleException(String message, Exception e) {
        e.printStackTrace();
        System.err.println(message + ": " + e.getMessage());
    }
}

