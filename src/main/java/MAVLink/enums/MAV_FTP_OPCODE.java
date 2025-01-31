/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package MAVLink.enums;

/**
 * MAV FTP opcodes: https://mavlink.io/en/services/ftp.html
 */
public class MAV_FTP_OPCODE {
   public static final int MAV_FTP_OPCODE_NONE = 0; /* None. Ignored, always ACKed | */
   public static final int MAV_FTP_OPCODE_TERMINATESESSION = 1; /* TerminateSession: Terminates open Read session | */
   public static final int MAV_FTP_OPCODE_RESETSESSION = 2; /* ResetSessions: Terminates all open read sessions | */
   public static final int MAV_FTP_OPCODE_LISTDIRECTORY = 3; /* ListDirectory. List files and directories in path from offset | */
   public static final int MAV_FTP_OPCODE_OPENFILERO = 4; /* OpenFileRO: Opens file at path for reading, returns session | */
   public static final int MAV_FTP_OPCODE_READFILE = 5; /* ReadFile: Reads size bytes from offset in session | */
   public static final int MAV_FTP_OPCODE_CREATEFILE = 6; /* CreateFile: Creates file at path for writing, returns session | */
   public static final int MAV_FTP_OPCODE_WRITEFILE = 7; /* WriteFile: Writes size bytes to offset in session | */
   public static final int MAV_FTP_OPCODE_REMOVEFILE = 8; /* RemoveFile: Remove file at path | */
   public static final int MAV_FTP_OPCODE_CREATEDIRECTORY = 9; /* CreateDirectory: Creates directory at path | */
   public static final int MAV_FTP_OPCODE_REMOVEDIRECTORY = 10; /* RemoveDirectory: Removes directory at path. The directory must be empty. | */
   public static final int MAV_FTP_OPCODE_OPENFILEWO = 11; /* OpenFileWO: Opens file at path for writing, returns session | */
   public static final int MAV_FTP_OPCODE_TRUNCATEFILE = 12; /* TruncateFile: Truncate file at path to offset length | */
   public static final int MAV_FTP_OPCODE_RENAME = 13; /* Rename: Rename path1 to path2 | */
   public static final int MAV_FTP_OPCODE_CALCFILECRC = 14; /* CalcFileCRC32: Calculate CRC32 for file at path | */
   public static final int MAV_FTP_OPCODE_BURSTREADFILE = 15; /* BurstReadFile: Burst download session file | */
   public static final int MAV_FTP_OPCODE_ACK = 128; /* ACK: ACK response | */
   public static final int MAV_FTP_OPCODE_NAK = 129; /* NAK: NAK response | */
   public static final int MAV_FTP_OPCODE_ENUM_END = 130; /*  | */
}
            