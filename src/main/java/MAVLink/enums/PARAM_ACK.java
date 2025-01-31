/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * Result from PARAM_EXT_SET message (or a PARAM_SET within a transaction).
 */
public class PARAM_ACK {
   public static final int PARAM_ACK_ACCEPTED = 0; /* Parameter value ACCEPTED and SET | */
   public static final int PARAM_ACK_VALUE_UNSUPPORTED = 1; /* Parameter value UNKNOWN/UNSUPPORTED | */
   public static final int PARAM_ACK_FAILED = 2; /* Parameter failed to set | */
   public static final int PARAM_ACK_IN_PROGRESS = 3; /* Parameter value received but not yet set/accepted. A subsequent PARAM_ACK_TRANSACTION or PARAM_EXT_ACK with the final result will follow once operation is completed. This is returned immediately for parameters that take longer to set, indicating taht the the parameter was recieved and does not need to be resent. | */
   public static final int PARAM_ACK_ENUM_END = 4; /*  | */
}
            