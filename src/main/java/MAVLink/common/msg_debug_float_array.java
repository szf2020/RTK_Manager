/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DEBUG_FLOAT_ARRAY PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Large debug/prototyping array. The message uses the maximum available payload for data. The array_id and name fields are used to discriminate between messages in code and in user interfaces (respectively). Do not use in production code.
 */
public class msg_debug_float_array extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY = 350;
    public static final int MAVLINK_MSG_LENGTH = 252;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY;

    
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    @Description("Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.")
    @Units("us")
    public long time_usec;
    
    /**
     * Unique ID used to discriminate between arrays
     */
    @Description("Unique ID used to discriminate between arrays")
    @Units("")
    public int array_id;
    
    /**
     * Name, for human-friendly display in a Ground Control Station
     */
    @Description("Name, for human-friendly display in a Ground Control Station")
    @Units("")
    public byte[] name = new byte[10];
    
    /**
     * data
     */
    @Description("data")
    @Units("")
    public float[] data = new float[58];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY;

        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedShort(array_id);
        
        for (int i = 0; i < name.length; i++) {
            packet.payload.putByte(name[i]);
        }
                    
        
        if (isMavlink2) {
             
        for (int i = 0; i < data.length; i++) {
            packet.payload.putFloat(data[i]);
        }
                    
            
        }
        return packet;
    }

    /**
     * Decode a debug_float_array message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();
        this.array_id = payload.getUnsignedShort();
        
        for (int i = 0; i < this.name.length; i++) {
            this.name[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
             
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getFloat();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_debug_float_array() {
        this.msgid = MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_debug_float_array( long time_usec, int array_id, byte[] name, float[] data) {
        this.msgid = MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY;

        this.time_usec = time_usec;
        this.array_id = array_id;
        this.name = name;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_debug_float_array( long time_usec, int array_id, byte[] name, float[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.array_id = array_id;
        this.name = name;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_debug_float_array(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setName(String str) {
        int len = Math.min(str.length(), 10);
        for (int i=0; i<len; i++) {
            name[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<10; i++) {            // padding for the rest of the buffer
            name[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getName() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            if (name[i] != 0)
                buf.append((char) name[i]);
            else
                break;
        }
        return buf.toString();

    }
                           
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" array_id:"+array_id+" name:"+name+" data:"+data;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_DEBUG_FLOAT_ARRAY";
    }
}
        