/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MOUNT_ORIENTATION PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Orientation of a mount
 */
public class msg_mount_orientation extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MOUNT_ORIENTATION = 265;
    public static final int MAVLINK_MSG_LENGTH = 20;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MOUNT_ORIENTATION;

    
    /**
     * Timestamp (time since system boot).
     */
    @Description("Timestamp (time since system boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * Roll in global frame (set to NaN for invalid).
     */
    @Description("Roll in global frame (set to NaN for invalid).")
    @Units("deg")
    public float roll;
    
    /**
     * Pitch in global frame (set to NaN for invalid).
     */
    @Description("Pitch in global frame (set to NaN for invalid).")
    @Units("deg")
    public float pitch;
    
    /**
     * Yaw relative to vehicle (set to NaN for invalid).
     */
    @Description("Yaw relative to vehicle (set to NaN for invalid).")
    @Units("deg")
    public float yaw;
    
    /**
     * Yaw in absolute frame relative to Earth's North, north is 0 (set to NaN for invalid).
     */
    @Description("Yaw in absolute frame relative to Earth's North, north is 0 (set to NaN for invalid).")
    @Units("deg")
    public float yaw_absolute;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;

        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putFloat(roll);
        packet.payload.putFloat(pitch);
        packet.payload.putFloat(yaw);
        
        if (isMavlink2) {
             packet.payload.putFloat(yaw_absolute);
            
        }
        return packet;
    }

    /**
     * Decode a mount_orientation message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        this.roll = payload.getFloat();
        this.pitch = payload.getFloat();
        this.yaw = payload.getFloat();
        
        if (isMavlink2) {
             this.yaw_absolute = payload.getFloat();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mount_orientation() {
        this.msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_mount_orientation( long time_boot_ms, float roll, float pitch, float yaw, float yaw_absolute) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;

        this.time_boot_ms = time_boot_ms;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.yaw_absolute = yaw_absolute;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_mount_orientation( long time_boot_ms, float roll, float pitch, float yaw, float yaw_absolute, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.yaw_absolute = yaw_absolute;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mount_orientation(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;

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
        return "MAVLINK_MSG_ID_MOUNT_ORIENTATION - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" yaw_absolute:"+yaw_absolute;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_MOUNT_ORIENTATION";
    }
}
        