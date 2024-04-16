package com.app.rtk_manager;


import javafx.application.Platform;

public class DataProcessing {

    private double latitude;     // NAN if unknown/not set [deg]
    private double longitude;    // NAN if unknown/not set [deg]
    private double altitude;      // NAN if unknown/not set [m]
    private double meanAccuracy;    // [mm]

    public void processSurveyin(byte[] token) {
        // UBX-NAV-SVIN 메세지 확인
        if (token[0] == (byte) 0xB5 && token[1] == (byte) 0x62 &&
                token[2] == (byte) 0x01 && token[3] == (byte) 0x3B) { // NMEA

            long iTow = ((long) token[10] & 0xFF) |
                    (((long) token[11] & 0xFF) << 8) |
                    (((long) token[12] & 0xFF) << 16) |
                    (((long) token[13] & 0xFF) << 24);

            long dur = ((long) token[14] & 0xFF) |
                    (((long) token[15] & 0xFF) << 8) |
                    (((long) token[16] & 0xFF) << 16) |
                    (((long) token[17] & 0xFF) << 24);

            long meanX = ((long) token[18] & 0xFF) |
                    (((long) token[19] & 0xFF) << 8) |
                    (((long) token[20] & 0xFF) << 16) |
                    (((long) token[21] & 0xFF) << 24);

            long meanY = ((long) token[22] & 0xFF) |
                    (((long) token[23] & 0xFF) << 8) |
                    (((long) token[24] & 0xFF) << 16) |
                    (((long) token[25] & 0xFF) << 24);

            long meanZ = ((long) token[26] & 0xFF) |
                    (((long) token[27] & 0xFF) << 8) |
                    (((long) token[28] & 0xFF) << 16) |
                    (((long) token[29] & 0xFF) << 24);

            double meanAccuracy = ((long) token[34] & 0xFF) |
                    (((long) token[35] & 0xFF) << 8) |
                    (((long) token[36] & 0xFF) << 16) |
                    (((long) token[37] & 0xFF) << 24);
            meanAccuracy /= 1e4;

            long obs = ((long) token[38] & 0xFF) |
                    (((long) token[39] & 0xFF) << 8) |
                    (((long) token[40] & 0xFF) << 16) |
                    (((long) token[41] & 0xFF) << 24);

            long valid = ((long) token[42] & 0xFF);




            System.out.println("meanAcc: " + meanAccuracy);
        }
    }

    public void processPosllh(byte[] token) {
        // UBX-NAV-POSLLH 메세지 확인


        if (token[0] == (byte) 0xB5 && token[1] == (byte) 0x62 &&
                token[2] == (byte) 0x01 && token[3] == (byte) 0x02) {


            double latitude = ((long) token[14] & 0xFF) |
                    (((long) token[15] & 0xFF) << 8) |
                    (((long) token[16] & 0xFF) << 16) |
                    (((long) token[17] & 0xFF) << 24);
            latitude /= 1e7; // 도 단위로 변환

            double longitude = ((long) token[10] & 0xFF) |
                    (((long) token[11] & 0xFF) << 8) |
                    (((long) token[12] & 0xFF) << 16) |
                    (((long) token[13] & 0xFF) << 24);
            longitude /= 1e7; // 도 단위로 변환

            double altitude = ((long) token[18] & 0xFF) |
                    (((long) token[19] & 0xFF) << 8) |
                    (((long) token[20] & 0xFF) << 16) |
                    (((long) token[21] & 0xFF) << 24);
            altitude /= 1e3; // 미터 단위로 변환

            long hMSL = ((long) token[22] & 0xFF) |
                    (((long) token[23] & 0xFF) << 8) |
                    (((long) token[24] & 0xFF) << 16) |
                    (((long) token[25] & 0xFF) << 24);

            long hAcc = ((long) token[26] & 0xFF) |
                    (((long) token[27] & 0xFF) << 8) |
                    (((long) token[28] & 0xFF) << 16) |
                    (((long) token[29] & 0xFF) << 24);

            long vAcc = ((long) token[30] & 0xFF) |
                    (((long) token[31] & 0xFF) << 8) |
                    (((long) token[32] & 0xFF) << 16) |
                    (((long) token[33] & 0xFF) << 24);


            // 디코딩된 데이터 출력
            System.out.println("latitude : " + latitude);
            System.out.println("longitude : " + longitude);
            System.out.println("altitude : " + altitude);


        }
    }

    // Constructor
    public void SurveyInStatus(double latitude, double longitude, double altitude, double meanAccuracy) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.meanAccuracy = meanAccuracy;

    }

    // Getters and Setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getMeanAccuracy() {
        return meanAccuracy;
    }

    public void setMeanAccuracy(double meanAccuracy) {
        this.meanAccuracy = meanAccuracy;
    }

}


