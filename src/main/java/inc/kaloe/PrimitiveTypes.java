package inc.kaloe;

public class PrimitiveTypes {

    byte byteMax = Byte.MAX_VALUE;
    byte byteMin = Byte.MIN_VALUE;
    short shortMax = Short.MAX_VALUE;
    short shortMin = Short.MIN_VALUE;
    int intMax = Integer.MAX_VALUE;
    int intMin = Integer.MIN_VALUE;
    long longMax = Long.MAX_VALUE;
    long longMin = Long.MIN_VALUE;
    float maxFloat = Float.MAX_VALUE;
    float minFloat = Float.MIN_VALUE;
    double doubleMax = Double.MAX_VALUE;
    double doubleMin = Double.MIN_VALUE;

    byte MyByte1 = 8;
    short MyShort1 = 802;
    int MyInt1 = 1978802;
    float MyFloat1 = 5.25F;

    long MyLong1 = 50000L + 10L * (MyByte1 + MyShort1 + MyInt1);

}
