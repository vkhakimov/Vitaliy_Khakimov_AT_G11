package homework.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("Метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(5000));
        System.out.println("Метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(9223372036854775807L));
        System.out.println("Метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('2'));
        System.out.println("Метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat((float) 2.12345));
        System.out.println("Метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(2.12345));
        System.out.println("Метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 120));
        System.out.println("Метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 13));
        System.out.println("Метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(false));
    }
}
