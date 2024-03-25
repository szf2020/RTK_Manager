/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * Enumeration of estimator types
 */
public class MAV_ESTIMATOR_TYPE {
   public static final int MAV_ESTIMATOR_TYPE_UNKNOWN = 0; /* Unknown type of the estimator. | */
   public static final int MAV_ESTIMATOR_TYPE_NAIVE = 1; /* This is a naive estimator without any real covariance feedback. | */
   public static final int MAV_ESTIMATOR_TYPE_VISION = 2; /* Computer vision based estimate. Might be up to scale. | */
   public static final int MAV_ESTIMATOR_TYPE_VIO = 3; /* Visual-inertial estimate. | */
   public static final int MAV_ESTIMATOR_TYPE_GPS = 4; /* Plain GPS estimate. | */
   public static final int MAV_ESTIMATOR_TYPE_GPS_INS = 5; /* Estimator integrating GPS and inertial sensing. | */
   public static final int MAV_ESTIMATOR_TYPE_MOCAP = 6; /* Estimate from external motion capturing system. | */
   public static final int MAV_ESTIMATOR_TYPE_LIDAR = 7; /* Estimator based on lidar sensor input. | */
   public static final int MAV_ESTIMATOR_TYPE_AUTOPILOT = 8; /* Estimator on autopilot. | */
   public static final int MAV_ESTIMATOR_TYPE_ENUM_END = 9; /*  | */
}
            