/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * 
 */
public class MAV_ODID_AUTH_TYPE {
   public static final int MAV_ODID_AUTH_TYPE_NONE = 0; /* No authentication type is specified. | */
   public static final int MAV_ODID_AUTH_TYPE_UAS_ID_SIGNATURE = 1; /* Signature for the UAS (Unmanned Aircraft System) ID. | */
   public static final int MAV_ODID_AUTH_TYPE_OPERATOR_ID_SIGNATURE = 2; /* Signature for the Operator ID. | */
   public static final int MAV_ODID_AUTH_TYPE_MESSAGE_SET_SIGNATURE = 3; /* Signature for the entire message set. | */
   public static final int MAV_ODID_AUTH_TYPE_NETWORK_REMOTE_ID = 4; /* Authentication is provided by Network Remote ID. | */
   public static final int MAV_ODID_AUTH_TYPE_SPECIFIC_AUTHENTICATION = 5; /* The exact authentication type is indicated by the first byte of authentication_data and these type values are managed by ICAO. | */
   public static final int MAV_ODID_AUTH_TYPE_ENUM_END = 6; /*  | */
}
            