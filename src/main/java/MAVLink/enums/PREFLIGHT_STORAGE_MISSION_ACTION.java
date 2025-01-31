/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * 
        Actions for reading and writing plan information (mission, rally points, geofence) between persistent and volatile storage when using MAV_CMD_PREFLIGHT_STORAGE.
        (Commonly missions are loaded from persistent storage (flash/EEPROM) into volatile storage (RAM) on startup and written back when they are changed.)
      
 */
public class PREFLIGHT_STORAGE_MISSION_ACTION {
   public static final int MISSION_READ_PERSISTENT = 0; /* Read current mission data from persistent storage | */
   public static final int MISSION_WRITE_PERSISTENT = 1; /* Write current mission data to persistent storage | */
   public static final int MISSION_RESET_DEFAULT = 2; /* Erase all mission data stored on the vehicle (both persistent and volatile storage) | */
   public static final int PREFLIGHT_STORAGE_MISSION_ACTION_ENUM_END = 3; /*  | */
}
            