/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HIL_OPTICAL_FLOW PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Simulated optical flow from a flow sensor (e.g. PX4FLOW or optical mouse sensor)
 */
public class msg_hil_optical_flow extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HIL_OPTICAL_FLOW = 114;
    public static final int MAVLINK_MSG_LENGTH = 44;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_OPTICAL_FLOW;

    
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    @Description("Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.")
    @Units("us")
    public long time_usec;
    
    /**
     * Integration time. Divide integrated_x and integrated_y by the integration time to obtain average flow. The integration time also indicates the.
     */
    @Description("Integration time. Divide integrated_x and integrated_y by the integration time to obtain average flow. The integration time also indicates the.")
    @Units("us")
    public long integration_time_us;
    
    /**
     * Flow in radians around X axis (Sensor RH rotation about the X axis induces a positive flow. Sensor linear motion along the positive Y axis induces a negative flow.)
     */
    @Description("Flow in radians around X axis (Sensor RH rotation about the X axis induces a positive flow. Sensor linear motion along the positive Y axis induces a negative flow.)")
    @Units("rad")
    public float integrated_x;
    
    /**
     * Flow in radians around Y axis (Sensor RH rotation about the Y axis induces a positive flow. Sensor linear motion along the positive X axis induces a positive flow.)
     */
    @Description("Flow in radians around Y axis (Sensor RH rotation about the Y axis induces a positive flow. Sensor linear motion along the positive X axis induces a positive flow.)")
    @Units("rad")
    public float integrated_y;
    
    /**
     * RH rotation around X axis
     */
    @Description("RH rotation around X axis")
    @Units("rad")
    public float integrated_xgyro;
    
    /**
     * RH rotation around Y axis
     */
    @Description("RH rotation around Y axis")
    @Units("rad")
    public float integrated_ygyro;
    
    /**
     * RH rotation around Z axis
     */
    @Description("RH rotation around Z axis")
    @Units("rad")
    public float integrated_zgyro;
    
    /**
     * Time since the distance was sampled.
     */
    @Description("Time since the distance was sampled.")
    @Units("us")
    public long time_delta_distance_us;
    
    /**
     * Distance to the center of the flow field. Positive value (including zero): distance known. Negative value: Unknown distance.
     */
    @Description("Distance to the center of the flow field. Positive value (including zero): distance known. Negative value: Unknown distance.")
    @Units("m")
    public float distance;
    
    /**
     * Temperature
     */
    @Description("Temperature")
    @Units("cdegC")
    public short temperature;
    
    /**
     * Sensor ID
     */
    @Description("Sensor ID")
    @Units("")
    public short sensor_id;
    
    /**
     * Optical flow quality / confidence. 0: no valid flow, 255: maximum quality
     */
    @Description("Optical flow quality / confidence. 0: no valid flow, 255: maximum quality")
    @Units("")
    public short quality;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_HIL_OPTICAL_FLOW;

        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedInt(integration_time_us);
        packet.payload.putFloat(integrated_x);
        packet.payload.putFloat(integrated_y);
        packet.payload.putFloat(integrated_xgyro);
        packet.payload.putFloat(integrated_ygyro);
        packet.payload.putFloat(integrated_zgyro);
        packet.payload.putUnsignedInt(time_delta_distance_us);
        packet.payload.putFloat(distance);
        packet.payload.putShort(temperature);
        packet.payload.putUnsignedByte(sensor_id);
        packet.payload.putUnsignedByte(quality);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hil_optical_flow message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();
        this.integration_time_us = payload.getUnsignedInt();
        this.integrated_x = payload.getFloat();
        this.integrated_y = payload.getFloat();
        this.integrated_xgyro = payload.getFloat();
        this.integrated_ygyro = payload.getFloat();
        this.integrated_zgyro = payload.getFloat();
        this.time_delta_distance_us = payload.getUnsignedInt();
        this.distance = payload.getFloat();
        this.temperature = payload.getShort();
        this.sensor_id = payload.getUnsignedByte();
        this.quality = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hil_optical_flow() {
        this.msgid = MAVLINK_MSG_ID_HIL_OPTICAL_FLOW;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_hil_optical_flow( long time_usec, long integration_time_us, float integrated_x, float integrated_y, float integrated_xgyro, float integrated_ygyro, float integrated_zgyro, long time_delta_distance_us, float distance, short temperature, short sensor_id, short quality) {
        this.msgid = MAVLINK_MSG_ID_HIL_OPTICAL_FLOW;

        this.time_usec = time_usec;
        this.integration_time_us = integration_time_us;
        this.integrated_x = integrated_x;
        this.integrated_y = integrated_y;
        this.integrated_xgyro = integrated_xgyro;
        this.integrated_ygyro = integrated_ygyro;
        this.integrated_zgyro = integrated_zgyro;
        this.time_delta_distance_us = time_delta_distance_us;
        this.distance = distance;
        this.temperature = temperature;
        this.sensor_id = sensor_id;
        this.quality = quality;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_hil_optical_flow( long time_usec, long integration_time_us, float integrated_x, float integrated_y, float integrated_xgyro, float integrated_ygyro, float integrated_zgyro, long time_delta_distance_us, float distance, short temperature, short sensor_id, short quality, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HIL_OPTICAL_FLOW;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.integration_time_us = integration_time_us;
        this.integrated_x = integrated_x;
        this.integrated_y = integrated_y;
        this.integrated_xgyro = integrated_xgyro;
        this.integrated_ygyro = integrated_ygyro;
        this.integrated_zgyro = integrated_zgyro;
        this.time_delta_distance_us = time_delta_distance_us;
        this.distance = distance;
        this.temperature = temperature;
        this.sensor_id = sensor_id;
        this.quality = quality;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hil_optical_flow(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HIL_OPTICAL_FLOW;

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
        return "MAVLINK_MSG_ID_HIL_OPTICAL_FLOW - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" integration_time_us:"+integration_time_us+" integrated_x:"+integrated_x+" integrated_y:"+integrated_y+" integrated_xgyro:"+integrated_xgyro+" integrated_ygyro:"+integrated_ygyro+" integrated_zgyro:"+integrated_zgyro+" time_delta_distance_us:"+time_delta_distance_us+" distance:"+distance+" temperature:"+temperature+" sensor_id:"+sensor_id+" quality:"+quality;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_HIL_OPTICAL_FLOW";
    }
}
        