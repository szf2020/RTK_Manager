/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE REQUEST_EVENT PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Request one or more events to be (re-)sent. If first_sequence==last_sequence, only a single event is requested. Note that first_sequence can be larger than last_sequence (because the sequence number can wrap). Each sequence will trigger an EVENT or EVENT_ERROR response.
 */
public class msg_request_event extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_REQUEST_EVENT = 412;
    public static final int MAVLINK_MSG_LENGTH = 6;
    private static final long serialVersionUID = MAVLINK_MSG_ID_REQUEST_EVENT;

    
    /**
     * First sequence number of the requested event.
     */
    @Description("First sequence number of the requested event.")
    @Units("")
    public int first_sequence;
    
    /**
     * Last sequence number of the requested event.
     */
    @Description("Last sequence number of the requested event.")
    @Units("")
    public int last_sequence;
    
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
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_REQUEST_EVENT;

        packet.payload.putUnsignedShort(first_sequence);
        packet.payload.putUnsignedShort(last_sequence);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a request_event message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.first_sequence = payload.getUnsignedShort();
        this.last_sequence = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_request_event() {
        this.msgid = MAVLINK_MSG_ID_REQUEST_EVENT;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_request_event( int first_sequence, int last_sequence, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_REQUEST_EVENT;

        this.first_sequence = first_sequence;
        this.last_sequence = last_sequence;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_request_event( int first_sequence, int last_sequence, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_REQUEST_EVENT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.first_sequence = first_sequence;
        this.last_sequence = last_sequence;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_request_event(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_REQUEST_EVENT;

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
        return "MAVLINK_MSG_ID_REQUEST_EVENT - sysid:"+sysid+" compid:"+compid+" first_sequence:"+first_sequence+" last_sequence:"+last_sequence+" target_system:"+target_system+" target_component:"+target_component;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_REQUEST_EVENT";
    }
}
        