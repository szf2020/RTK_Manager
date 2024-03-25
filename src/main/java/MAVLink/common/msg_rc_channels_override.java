/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RC_CHANNELS_OVERRIDE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * The RAW values of the RC channels sent to the MAV to override info received from the RC radio. The standard PPM modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%. Individual receivers/transmitters might violate this specification.  Note carefully the semantic differences between the first 8 channels and the subsequent channels
 */
public class msg_rc_channels_override extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE = 70;
    public static final int MAVLINK_MSG_LENGTH = 38;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE;

    
    /**
     * RC channel 1 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 1 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan1_raw;
    
    /**
     * RC channel 2 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 2 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan2_raw;
    
    /**
     * RC channel 3 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 3 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan3_raw;
    
    /**
     * RC channel 4 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 4 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan4_raw;
    
    /**
     * RC channel 5 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 5 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan5_raw;
    
    /**
     * RC channel 6 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 6 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan6_raw;
    
    /**
     * RC channel 7 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 7 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan7_raw;
    
    /**
     * RC channel 8 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.
     */
    @Description("RC channel 8 value. A value of UINT16_MAX means to ignore this field. A value of 0 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan8_raw;
    
    /**
     * System ID
     */
    @Description("System ID")
    @Units("")
    public short target_system;
    
    /**
     * Component ID
     */
    @Description("Component ID")
    @Units("")
    public short target_component;
    
    /**
     * RC channel 9 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 9 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan9_raw;
    
    /**
     * RC channel 10 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 10 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan10_raw;
    
    /**
     * RC channel 11 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 11 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan11_raw;
    
    /**
     * RC channel 12 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 12 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan12_raw;
    
    /**
     * RC channel 13 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 13 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan13_raw;
    
    /**
     * RC channel 14 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 14 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan14_raw;
    
    /**
     * RC channel 15 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 15 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan15_raw;
    
    /**
     * RC channel 16 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 16 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan16_raw;
    
    /**
     * RC channel 17 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 17 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan17_raw;
    
    /**
     * RC channel 18 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.
     */
    @Description("RC channel 18 value. A value of 0 or UINT16_MAX means to ignore this field. A value of UINT16_MAX-1 means to release this channel back to the RC radio.")
    @Units("us")
    public int chan18_raw;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE;

        packet.payload.putUnsignedShort(chan1_raw);
        packet.payload.putUnsignedShort(chan2_raw);
        packet.payload.putUnsignedShort(chan3_raw);
        packet.payload.putUnsignedShort(chan4_raw);
        packet.payload.putUnsignedShort(chan5_raw);
        packet.payload.putUnsignedShort(chan6_raw);
        packet.payload.putUnsignedShort(chan7_raw);
        packet.payload.putUnsignedShort(chan8_raw);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
             packet.payload.putUnsignedShort(chan9_raw);
             packet.payload.putUnsignedShort(chan10_raw);
             packet.payload.putUnsignedShort(chan11_raw);
             packet.payload.putUnsignedShort(chan12_raw);
             packet.payload.putUnsignedShort(chan13_raw);
             packet.payload.putUnsignedShort(chan14_raw);
             packet.payload.putUnsignedShort(chan15_raw);
             packet.payload.putUnsignedShort(chan16_raw);
             packet.payload.putUnsignedShort(chan17_raw);
             packet.payload.putUnsignedShort(chan18_raw);
            
        }
        return packet;
    }

    /**
     * Decode a rc_channels_override message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.chan1_raw = payload.getUnsignedShort();
        this.chan2_raw = payload.getUnsignedShort();
        this.chan3_raw = payload.getUnsignedShort();
        this.chan4_raw = payload.getUnsignedShort();
        this.chan5_raw = payload.getUnsignedShort();
        this.chan6_raw = payload.getUnsignedShort();
        this.chan7_raw = payload.getUnsignedShort();
        this.chan8_raw = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.chan9_raw = payload.getUnsignedShort();
             this.chan10_raw = payload.getUnsignedShort();
             this.chan11_raw = payload.getUnsignedShort();
             this.chan12_raw = payload.getUnsignedShort();
             this.chan13_raw = payload.getUnsignedShort();
             this.chan14_raw = payload.getUnsignedShort();
             this.chan15_raw = payload.getUnsignedShort();
             this.chan16_raw = payload.getUnsignedShort();
             this.chan17_raw = payload.getUnsignedShort();
             this.chan18_raw = payload.getUnsignedShort();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_rc_channels_override() {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_rc_channels_override( int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, short target_system, short target_component, int chan9_raw, int chan10_raw, int chan11_raw, int chan12_raw, int chan13_raw, int chan14_raw, int chan15_raw, int chan16_raw, int chan17_raw, int chan18_raw) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE;

        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.target_system = target_system;
        this.target_component = target_component;
        this.chan9_raw = chan9_raw;
        this.chan10_raw = chan10_raw;
        this.chan11_raw = chan11_raw;
        this.chan12_raw = chan12_raw;
        this.chan13_raw = chan13_raw;
        this.chan14_raw = chan14_raw;
        this.chan15_raw = chan15_raw;
        this.chan16_raw = chan16_raw;
        this.chan17_raw = chan17_raw;
        this.chan18_raw = chan18_raw;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_rc_channels_override( int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, short target_system, short target_component, int chan9_raw, int chan10_raw, int chan11_raw, int chan12_raw, int chan13_raw, int chan14_raw, int chan15_raw, int chan16_raw, int chan17_raw, int chan18_raw, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.target_system = target_system;
        this.target_component = target_component;
        this.chan9_raw = chan9_raw;
        this.chan10_raw = chan10_raw;
        this.chan11_raw = chan11_raw;
        this.chan12_raw = chan12_raw;
        this.chan13_raw = chan13_raw;
        this.chan14_raw = chan14_raw;
        this.chan15_raw = chan15_raw;
        this.chan16_raw = chan16_raw;
        this.chan17_raw = chan17_raw;
        this.chan18_raw = chan18_raw;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_rc_channels_override(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE;

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
        return "MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE - sysid:"+sysid+" compid:"+compid+" chan1_raw:"+chan1_raw+" chan2_raw:"+chan2_raw+" chan3_raw:"+chan3_raw+" chan4_raw:"+chan4_raw+" chan5_raw:"+chan5_raw+" chan6_raw:"+chan6_raw+" chan7_raw:"+chan7_raw+" chan8_raw:"+chan8_raw+" target_system:"+target_system+" target_component:"+target_component+" chan9_raw:"+chan9_raw+" chan10_raw:"+chan10_raw+" chan11_raw:"+chan11_raw+" chan12_raw:"+chan12_raw+" chan13_raw:"+chan13_raw+" chan14_raw:"+chan14_raw+" chan15_raw:"+chan15_raw+" chan16_raw:"+chan16_raw+" chan17_raw:"+chan17_raw+" chan18_raw:"+chan18_raw;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RC_CHANNELS_OVERRIDE";
    }
}
        