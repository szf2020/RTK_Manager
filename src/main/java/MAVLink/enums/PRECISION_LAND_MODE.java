/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * Precision land modes (used in MAV_CMD_NAV_LAND).
 */
public class PRECISION_LAND_MODE {
   public static final int PRECISION_LAND_MODE_DISABLED = 0; /* Normal (non-precision) landing. | */
   public static final int PRECISION_LAND_MODE_OPPORTUNISTIC = 1; /* Use precision landing if beacon detected when land command accepted, otherwise land normally. | */
   public static final int PRECISION_LAND_MODE_REQUIRED = 2; /* Use precision landing, searching for beacon if not found when land command accepted (land normally if beacon cannot be found). | */
   public static final int PRECISION_LAND_MODE_ENUM_END = 3; /*  | */
}
            