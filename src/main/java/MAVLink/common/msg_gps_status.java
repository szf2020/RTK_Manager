/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GPS_STATUS PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * The positioning status, as reported by GPS. This message is intended to display status information about each satellite visible to the receiver. See message GLOBAL_POSITION_INT for the global position estimate. This message can contain information for up to 20 satellites.
 */
public class msg_gps_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GPS_STATUS = 25;
    public static final int MAVLINK_MSG_LENGTH = 101;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GPS_STATUS;

    
    /**
     * Number of satellites visible
     */
    @Description("Number of satellites visible")
    @Units("")
    public short satellites_visible;
    
    /**
     * Global satellite ID
     */
    @Description("Global satellite ID")
    @Units("")
    public short[] satellite_prn = new short[20];
    
    /**
     * 0: Satellite not used, 1: used for localization
     */
    @Description("0: Satellite not used, 1: used for localization")
    @Units("")
    public short[] satellite_used = new short[20];
    
    /**
     * Elevation (0: right on top of receiver, 90: on the horizon) of satellite
     */
    @Description("Elevation (0: right on top of receiver, 90: on the horizon) of satellite")
    @Units("deg")
    public short[] satellite_elevation = new short[20];
    
    /**
     * Direction of satellite, 0: 0 deg, 255: 360 deg.
     */
    @Description("Direction of satellite, 0: 0 deg, 255: 360 deg.")
    @Units("deg")
    public short[] satellite_azimuth = new short[20];
    
    /**
     * Signal to noise ratio of satellite
     */
    @Description("Signal to noise ratio of satellite")
    @Units("dB")
    public short[] satellite_snr = new short[20];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_GPS_STATUS;

        packet.payload.putUnsignedByte(satellites_visible);
        
        for (int i = 0; i < satellite_prn.length; i++) {
            packet.payload.putUnsignedByte(satellite_prn[i]);
        }
                    
        
        for (int i = 0; i < satellite_used.length; i++) {
            packet.payload.putUnsignedByte(satellite_used[i]);
        }
                    
        
        for (int i = 0; i < satellite_elevation.length; i++) {
            packet.payload.putUnsignedByte(satellite_elevation[i]);
        }
                    
        
        for (int i = 0; i < satellite_azimuth.length; i++) {
            packet.payload.putUnsignedByte(satellite_azimuth[i]);
        }
                    
        
        for (int i = 0; i < satellite_snr.length; i++) {
            packet.payload.putUnsignedByte(satellite_snr[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gps_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.satellites_visible = payload.getUnsignedByte();
        
        for (int i = 0; i < this.satellite_prn.length; i++) {
            this.satellite_prn[i] = payload.getUnsignedByte();
        }
                
        
        for (int i = 0; i < this.satellite_used.length; i++) {
            this.satellite_used[i] = payload.getUnsignedByte();
        }
                
        
        for (int i = 0; i < this.satellite_elevation.length; i++) {
            this.satellite_elevation[i] = payload.getUnsignedByte();
        }
                
        
        for (int i = 0; i < this.satellite_azimuth.length; i++) {
            this.satellite_azimuth[i] = payload.getUnsignedByte();
        }
                
        
        for (int i = 0; i < this.satellite_snr.length; i++) {
            this.satellite_snr[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gps_status() {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gps_status( short satellites_visible, short[] satellite_prn, short[] satellite_used, short[] satellite_elevation, short[] satellite_azimuth, short[] satellite_snr) {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;

        this.satellites_visible = satellites_visible;
        this.satellite_prn = satellite_prn;
        this.satellite_used = satellite_used;
        this.satellite_elevation = satellite_elevation;
        this.satellite_azimuth = satellite_azimuth;
        this.satellite_snr = satellite_snr;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gps_status( short satellites_visible, short[] satellite_prn, short[] satellite_used, short[] satellite_elevation, short[] satellite_azimuth, short[] satellite_snr, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.satellites_visible = satellites_visible;
        this.satellite_prn = satellite_prn;
        this.satellite_used = satellite_used;
        this.satellite_elevation = satellite_elevation;
        this.satellite_azimuth = satellite_azimuth;
        this.satellite_snr = satellite_snr;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gps_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GPS_STATUS - sysid:"+sysid+" compid:"+compid+" satellites_visible:"+satellites_visible+" satellite_prn:"+satellite_prn+" satellite_used:"+satellite_used+" satellite_elevation:"+satellite_elevation+" satellite_azimuth:"+satellite_azimuth+" satellite_snr:"+satellite_snr;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GPS_STATUS";
    }
}
        