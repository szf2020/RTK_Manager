package com.app.rtk_manager;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CommandFactory {
    public static double  surveyAccValue;
    public static int surveyTimeValue;

    public static byte[] RTCM1005() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x05, // Message ID: RTCM 1005
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,


                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1074() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x4A, // Message ID: RTCM 1074
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,


                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1077() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x4D, // Message ID: RTCM 1077
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,

                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1084() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x54, // Message ID: RTCM 1084
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,
                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1087() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x57, // Message ID: RTCM 1087
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,
                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1094() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x5E, // Message ID: RTCM 1094
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,
                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1230() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0xE6, // Message ID: RTCM 1230
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,

                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1097() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x61, // Message ID: RTCM 1097
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,


                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1124() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x7C, // Message ID: RTCM 1124
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,


                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] RTCM1127() {
        // RTCM 데이터 스트림을 활성화하는 UBX 명령 생성
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration),UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0xF5, (byte) 0x7F, // Message ID: RTCM 1127
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,


                // Checksum (2 bytes) will be added later

        };
    }

    public static byte[] SurveyinStc() {
        return new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x01, // UBX Class: CFG (Configuration), UBX Message ID: MSG (Message)
                (byte) 0x08, (byte) 0x00, // payload length
                (byte) 0x01, (byte) 0x3B, // Message ID: survey-in
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x01,
                (byte) 0x00, (byte) 0x00,
                //   (byte) 0x00, (byte) 0x00,

                //  (byte) 0x4C, (byte) 0x4B,

                // 체크섬 (2 바이트)는 나중에 추가될 것입니다
        };
    }

    //timemode3 설정
    public static byte[] RequestSurveyin() {

        byte[] accBytes = decimalToFixedPoint(surveyAccValue, 4);
        //byte[] accBytes = ByteBuffer.allocate(8).putDouble((float) surveyAccValue).array();
        byte[] timeBytes = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(surveyTimeValue).array();

        // accBytes와 timeBytes 배열에 들어간 값을 출력
        System.out.println("accBytes: " + bytesToHex(accBytes));
        System.out.println("timeBytes: " + bytesToHex(timeBytes));

        // RequestSurveyin 메소드에서 사용할 바이트 배열 생성
        byte[] request = new byte[]{
                (byte) 0xB5, (byte) 0x62, // UBX Sync Characters
                (byte) 0x06, (byte) 0x71, // UBX Class: CFG (Configuration), UBX Message ID: MSG (Message)
                (byte) 0x28, (byte) 0x00, // payload length
                (byte) 0x00, (byte) 0x00,
                (byte) 0x01, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                timeBytes[0], timeBytes[1],
                timeBytes[2], timeBytes[3], // surveyTime
                accBytes[0], accBytes[1],
                accBytes[2], accBytes[3],
//                accBytes[4], accBytes[5],
//                accBytes[6], accBytes[7],
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00
        };
        return request;
    }

    public static byte[] decimalToFixedPoint(double decimal, int precision) {
        // Scaling factor based on precision (e.g., 2 meters = 100 for 2 decimal places)
        int scaleFactor = (int) Math.pow(10, precision);

        // Multiply the decimal number by the scaling factor and convert to integer
        int fixedPoint = (int) (decimal * scaleFactor);

        // Convert the integer to bytes
        byte[] bytes = new byte[4];
        bytes[0] = (byte) (fixedPoint & 0xFF);
        bytes[1] = (byte) ((fixedPoint >> 8) & 0xFF);
        bytes[2] = (byte) ((fixedPoint >> 16) & 0xFF);
        bytes[3] = (byte) ((fixedPoint >> 24) & 0xFF);

        return bytes;
    }

    // 바이트 배열을 16진수 문자열로 변환하는 유틸리티 함수
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString().trim();
    }
}