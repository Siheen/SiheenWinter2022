package varaiblesAndDataTypes;

public class DataTypes {
// 1 byte of memory
    byte min=-128;
    byte max=127;
    byte a=10;
    byte b=4;
    byte c=(byte)(a+b);
    static byte defaultByte;
// 2 bytes of memory
    short minShort =-32768;
    short macShort= 32767;
    static short defaultShort;
//   4 bytes of memory

    int minInt=-2147483648;
    int maxInt=2147483647;
   static  int defaultInt;

//   8 bytes of memory -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    long minLong= -9223372036854775808L;
    long maxLong= 9223372036854775807L;
   static long defaultLong;
//    4 bytes of memory
    float aFloat=105.667865f;
   static float defaultFloat;
//    8 bytes of memory
    double aDouble= 105.667865;
   static double defaultDouble;

//    1 bit
    boolean isItRainy=false;
    static boolean defaultBoolean;
//   2 bytes

     char aChar='a';
    static char defaultChar;

    public static void main(String[] args) {
        System.out.println(defaultByte);
        System.out.println(defaultLong);
        System.out.println(defaultFloat);
        System.out.println(defaultDouble);
        System.out.println(defaultBoolean);
        System.out.println(defaultChar);
    }

}

