package homework.day1.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("Method returnNewIf returned: " + trainMethodsIf.returnNewInt(25));
        System.out.println("Method returnNewLong returned: " + trainMethodsIf.returnNewLong(305L));
        System.out.println("Method returnNewChar returned: " + trainMethodsIf.returnNewChar('g'));
        System.out.println("Method returnNewDouble returned: " + trainMethodsIf.returnNewDouble(305.3));
        trainMethodsIf.returnNewBoolean(true);
    }
}
