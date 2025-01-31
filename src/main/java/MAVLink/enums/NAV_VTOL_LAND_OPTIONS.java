/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * 
 */
public class NAV_VTOL_LAND_OPTIONS {
   public static final int NAV_VTOL_LAND_OPTIONS_DEFAULT = 0; /* Default autopilot landing behaviour. | */
   public static final int NAV_VTOL_LAND_OPTIONS_FW_DESCENT = 1; /* Descend in fixed wing mode, transitioning to multicopter mode for vertical landing when close to the ground.
          The fixed wing descent pattern is at the discretion of the vehicle (e.g. transition altitude, loiter direction, radius, and speed, etc.).
         | */
   public static final int NAV_VTOL_LAND_OPTIONS_HOVER_DESCENT = 2; /* Land in multicopter mode on reaching the landing co-ordinates (the whole landing is by "hover descent"). | */
   public static final int NAV_VTOL_LAND_OPTIONS_ENUM_END = 3; /*  | */
}
            