/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LOG_DATA PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Reply to LOG_REQUEST_DATA
 */
public class msg_log_data extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LOG_DATA = 120;
    public static final int MAVLINK_MSG_LENGTH = 97;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LOG_DATA;

    
    /**
     * Offset into the log
     */
    @Description("Offset into the log")
    @Units("")
    public long ofs;
    
    /**
     * Log id (from LOG_ENTRY reply)
     */
    @Description("Log id (from LOG_ENTRY reply)")
    @Units("")
    public int id;
    
    /**
     * Number of bytes (zero for end of log)
     */
    @Description("Number of bytes (zero for end of log)")
    @Units("bytes")
    public short count;
    
    /**
     * log data
     */
    @Description("log data")
    @Units("")
    public short[] data = new short[90];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_LOG_DATA;

        packet.payload.putUnsignedInt(ofs);
        packet.payload.putUnsignedShort(id);
        packet.payload.putUnsignedByte(count);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a log_data message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.ofs = payload.getUnsignedInt();
        this.id = payload.getUnsignedShort();
        this.count = payload.getUnsignedByte();
        
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_log_data() {
        this.msgid = MAVLINK_MSG_ID_LOG_DATA;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_log_data( long ofs, int id, short count, short[] data) {
        this.msgid = MAVLINK_MSG_ID_LOG_DATA;

        this.ofs = ofs;
        this.id = id;
        this.count = count;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_log_data( long ofs, int id, short count, short[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_LOG_DATA;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ofs = ofs;
        this.id = id;
        this.count = count;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_log_data(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_LOG_DATA;

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
        return "MAVLINK_MSG_ID_LOG_DATA - sysid:"+sysid+" compid:"+compid+" ofs:"+ofs+" id:"+id+" count:"+count+" data:"+data;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_LOG_DATA";
    }
}
        