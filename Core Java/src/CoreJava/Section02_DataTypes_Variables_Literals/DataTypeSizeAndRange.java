package CoreJava.Section02_DataTypes_Variables_Literals;

public class DataTypeSizeAndRange {
    public static void main(String[] args) {
        System.out.println("===== Integer Types =====");
        System.out.println("byte    : Size = " + Byte.BYTES + " bytes, Range = " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short   : Size = " + Short.BYTES + " bytes, Range = " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int     : Size = " + Integer.BYTES + " bytes, Range = " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long    : Size = " + Long.BYTES + " bytes, Range = " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("\n===== Floating Point Types =====");
        System.out.println("float   : Size = " + Float.BYTES + " bytes, Range = " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double  : Size = " + Double.BYTES + " bytes, Range = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("\n===== Character Type =====");
        System.out.println("char    : Size = " + Character.BYTES + " bytes, Range = " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        System.out.println("\n===== Boolean Type =====");
        System.out.println("boolean : Size = JVM-dependent (typically 1 byte), Values = true / false");
    }
}
