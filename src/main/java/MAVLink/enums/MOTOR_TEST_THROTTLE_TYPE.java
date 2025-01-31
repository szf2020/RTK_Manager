/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * Defines how throttle value is represented in MAV_CMD_DO_MOTOR_TEST.
 */
public class MOTOR_TEST_THROTTLE_TYPE {
   public static final int MOTOR_TEST_THROTTLE_PERCENT = 0; /* Throttle as a percentage (0 ~ 100) | */
   public static final int MOTOR_TEST_THROTTLE_PWM = 1; /* Throttle as an absolute PWM value (normally in range of 1000~2000). | */
   public static final int MOTOR_TEST_THROTTLE_PILOT = 2; /* Throttle pass-through from pilot's transmitter. | */
   public static final int MOTOR_TEST_COMPASS_CAL = 3; /* Per-motor compass calibration test. | */
   public static final int MOTOR_TEST_THROTTLE_TYPE_ENUM_END = 4; /*  | */
}
            