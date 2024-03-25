/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GLOBAL_POSITION_INT PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * The filtered global position (e.g. fused GPS and accelerometers). The position is in GPS-frame (right-handed, Z-up). It
               is designed as scaled integer message since the resolution of float is not sufficient.
 */
public class msg_global_position_int extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GLOBAL_POSITION_INT = 33;
    public static final int MAVLINK_MSG_LENGTH = 28;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GLOBAL_POSITION_INT;

    
    /**
     * Timestamp (time since system boot).
     */
    @Description("Timestamp (time since system boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * Latitude, expressed
     */
    @Description("Latitude, expressed")
    @Units("degE7")
    public int lat;
    
    /**
     * Longitude, expressed
     */
    @Description("Longitude, expressed")
    @Units("degE7")
    public int lon;
    
    /**
     * Altitude (MSL). Note that virtually all GPS modules provide both WGS84 and MSL.
     */
    @Description("Altitude (MSL). Note that virtually all GPS modules provide both WGS84 and MSL.")
    @Units("mm")
    public int alt;
    
    /**
     * Altitude above ground
     */
    @Description("Altitude above ground")
    @Units("mm")
    public int relative_alt;
    
    /**
     * Ground X Speed (Latitude, positive north)
     */
    @Description("Ground X Speed (Latitude, positive north)")
    @Units("cm/s")
    public short vx;
    
    /**
     * Ground Y Speed (Longitude, positive east)
     */
    @Description("Ground Y Speed (Longitude, positive east)")
    @Units("cm/s")
    public short vy;
    
    /**
     * Ground Z Speed (Altitude, positive down)
     */
    @Description("Ground Z Speed (Altitude, positive down)")
    @Units("cm/s")
    public short vz;
    
    /**
     * Vehicle heading (yaw angle), 0.0..359.99 degrees. If unknown, set to: UINT16_MAX
     */
    @Description("Vehicle heading (yaw angle), 0.0..359.99 degrees. If unknown, set to: UINT16_MAX")
    @Units("cdeg")
    public int hdg;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT;

        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putInt(alt);
        packet.payload.putInt(relative_alt);
        packet.payload.putShort(vx);
        packet.payload.putShort(vy);
        packet.payload.putShort(vz);
        packet.payload.putUnsignedShort(hdg);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a global_position_int message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        this.alt = payload.getInt();
        this.relative_alt = payload.getInt();
        this.vx = payload.getShort();
        this.vy = payload.getShort();
        this.vz = payload.getShort();
        this.hdg = payload.getUnsignedShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_global_position_int() {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_global_position_int( long time_boot_ms, int lat, int lon, int alt, int relative_alt, short vx, short vy, short vz, int hdg) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT;

        this.time_boot_ms = time_boot_ms;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.relative_alt = relative_alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.hdg = hdg;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_global_position_int( long time_boot_ms, int lat, int lon, int alt, int relative_alt, short vx, short vy, short vz, int hdg, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.relative_alt = relative_alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.hdg = hdg;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_global_position_int(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT;

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
        return "MAVLINK_MSG_ID_GLOBAL_POSITION_INT - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" lat:"+lat+" lon:"+lon+" alt:"+alt+" relative_alt:"+relative_alt+" vx:"+vx+" vy:"+vy+" vz:"+vz+" hdg:"+hdg;
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GLOBAL_POSITION_INT";
    }
}
        