/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GLOBAL_POSITION_INT_COV PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * The filtered global position (e.g. fused GPS and accelerometers). The position is in GPS-frame (right-handed, Z-up). It  is designed as scaled integer message since the resolution of float is not sufficient. NOTE: This message is intended for onboard networks / companion computers and higher-bandwidth links and optimized for accuracy and completeness. Please use the GLOBAL_POSITION_INT message for a minimal subset.
 */
public class msg_global_position_int_cov extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV = 63;
    public static final int MAVLINK_MSG_LENGTH = 181;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;

    
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    @Description("Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.")
    @Units("us")
    public long time_usec;
    
    /**
     * Latitude
     */
    @Description("Latitude")
    @Units("degE7")
    public int lat;
    
    /**
     * Longitude
     */
    @Description("Longitude")
    @Units("degE7")
    public int lon;
    
    /**
     * Altitude in meters above MSL
     */
    @Description("Altitude in meters above MSL")
    @Units("mm")
    public int alt;
    
    /**
     * Altitude above ground
     */
    @Description("Altitude above ground")
    @Units("mm")
    public int relative_alt;
    
    /**
     * Ground X Speed (Latitude)
     */
    @Description("Ground X Speed (Latitude)")
    @Units("m/s")
    public float vx;
    
    /**
     * Ground Y Speed (Longitude)
     */
    @Description("Ground Y Speed (Longitude)")
    @Units("m/s")
    public float vy;
    
    /**
     * Ground Z Speed (Altitude)
     */
    @Description("Ground Z Speed (Altitude)")
    @Units("m/s")
    public float vz;
    
    /**
     * Row-major representation of a 6x6 position and velocity 6x6 cross-covariance matrix (states: lat, lon, alt, vx, vy, vz; first six entries are the first ROW, next six entries are the second row, etc.). If unknown, assign NaN value to first element in the array.
     */
    @Description("Row-major representation of a 6x6 position and velocity 6x6 cross-covariance matrix (states: lat, lon, alt, vx, vy, vz; first six entries are the first ROW, next six entries are the second row, etc.). If unknown, assign NaN value to first element in the array.")
    @Units("")
    public float[] covariance = new float[36];
    
    /**
     * Class id of the estimator this estimate originated from.
     */
    @Description("Class id of the estimator this estimate originated from.")
    @Units("")
    public short estimator_type;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;

        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putInt(alt);
        packet.payload.putInt(relative_alt);
        packet.payload.putFloat(vx);
        packet.payload.putFloat(vy);
        packet.payload.putFloat(vz);
        
        for (int i = 0; i < covariance.length; i++) {
            packet.payload.putFloat(covariance[i]);
        }
                    
        packet.payload.putUnsignedByte(estimator_type);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a global_position_int_cov message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        this.alt = payload.getInt();
        this.relative_alt = payload.getInt();
        this.vx = payload.getFloat();
        this.vy = payload.getFloat();
        this.vz = payload.getFloat();
        
        for (int i = 0; i < this.covariance.length; i++) {
            this.covariance[i] = payload.getFloat();
        }
                
        this.estimator_type = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_global_position_int_cov() {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_global_position_int_cov( long time_usec, int lat, int lon, int alt, int relative_alt, float vx, float vy, float vz, float[] covariance, short estimator_type) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.relative_alt = relative_alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.covariance = covariance;
        this.estimator_type = estimator_type;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_global_position_int_cov( long time_usec, int lat, int lon, int alt, int relative_alt, float vx, float vy, float vz, float[] covariance, short estimator_type, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.relative_alt = relative_alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.covariance = covariance;
        this.estimator_type = estimator_type;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_global_position_int_cov(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;

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
        return "MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" lat:"+lat+" lon:"+lon+" alt:"+alt+" relative_alt:"+relative_alt+" vx:"+vx+" vy:"+vy+" vz:"+vz+" covariance:"+covariance+" estimator_type:"+estimator_type;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV";
    }
}
        