package homework.basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();

        trainMethodsPrimitive.printInt(2147483647);
        trainMethodsPrimitive.printLong(9223372036854775807L);
        trainMethodsPrimitive.printShort((short) 32767);
        trainMethodsPrimitive.printFloat((float) 1.145678);
        trainMethodsPrimitive.printDouble(1.12342131231231231231235678);
        trainMethodsPrimitive.printBoolean(false);
        trainMethodsPrimitive.printChar('1');
        trainMethodsPrimitive.printByte((byte) 127);
    }
}
