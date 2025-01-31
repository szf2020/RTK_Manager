/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_MANAGER_STATUS PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Current status about a high level gimbal manager. This message should be broadcast at a low regular rate (e.g. 5Hz).
 */
public class msg_gimbal_manager_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS = 281;
    public static final int MAVLINK_MSG_LENGTH = 13;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS;

    
    /**
     * Timestamp (time since system boot).
     */
    @Description("Timestamp (time since system boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * High level gimbal manager flags currently applied.
     */
    @Description("High level gimbal manager flags currently applied.")
    @Units("")
    public long flags;
    
    /**
     * Gimbal device ID that this gimbal manager is responsible for.
     */
    @Description("Gimbal device ID that this gimbal manager is responsible for.")
    @Units("")
    public short gimbal_device_id;
    
    /**
     * System ID of MAVLink component with primary control, 0 for none.
     */
    @Description("System ID of MAVLink component with primary control, 0 for none.")
    @Units("")
    public short primary_control_sysid;
    
    /**
     * Component ID of MAVLink component with primary control, 0 for none.
     */
    @Description("Component ID of MAVLink component with primary control, 0 for none.")
    @Units("")
    public short primary_control_compid;
    
    /**
     * System ID of MAVLink component with secondary control, 0 for none.
     */
    @Description("System ID of MAVLink component with secondary control, 0 for none.")
    @Units("")
    public short secondary_control_sysid;
    
    /**
     * Component ID of MAVLink component with secondary control, 0 for none.
     */
    @Description("Component ID of MAVLink component with secondary control, 0 for none.")
    @Units("")
    public short secondary_control_compid;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS;

        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putUnsignedInt(flags);
        packet.payload.putUnsignedByte(gimbal_device_id);
        packet.payload.putUnsignedByte(primary_control_sysid);
        packet.payload.putUnsignedByte(primary_control_compid);
        packet.payload.putUnsignedByte(secondary_control_sysid);
        packet.payload.putUnsignedByte(secondary_control_compid);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gimbal_manager_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        this.flags = payload.getUnsignedInt();
        this.gimbal_device_id = payload.getUnsignedByte();
        this.primary_control_sysid = payload.getUnsignedByte();
        this.primary_control_compid = payload.getUnsignedByte();
        this.secondary_control_sysid = payload.getUnsignedByte();
        this.secondary_control_compid = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gimbal_manager_status() {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gimbal_manager_status( long time_boot_ms, long flags, short gimbal_device_id, short primary_control_sysid, short primary_control_compid, short secondary_control_sysid, short secondary_control_compid) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS;

        this.time_boot_ms = time_boot_ms;
        this.flags = flags;
        this.gimbal_device_id = gimbal_device_id;
        this.primary_control_sysid = primary_control_sysid;
        this.primary_control_compid = primary_control_compid;
        this.secondary_control_sysid = secondary_control_sysid;
        this.secondary_control_compid = secondary_control_compid;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gimbal_manager_status( long time_boot_ms, long flags, short gimbal_device_id, short primary_control_sysid, short primary_control_compid, short secondary_control_sysid, short secondary_control_compid, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.flags = flags;
        this.gimbal_device_id = gimbal_device_id;
        this.primary_control_sysid = primary_control_sysid;
        this.primary_control_compid = primary_control_compid;
        this.secondary_control_sysid = secondary_control_sysid;
        this.secondary_control_compid = secondary_control_compid;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gimbal_manager_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS;

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
        return "MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" flags:"+flags+" gimbal_device_id:"+gimbal_device_id+" primary_control_sysid:"+primary_control_sysid+" primary_control_compid:"+primary_control_compid+" secondary_control_sysid:"+secondary_control_sysid+" secondary_control_compid:"+secondary_control_compid;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GIMBAL_MANAGER_STATUS";
    }
}
        