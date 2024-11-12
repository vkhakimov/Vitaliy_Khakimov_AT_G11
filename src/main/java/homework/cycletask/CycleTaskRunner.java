package homework.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileTask whileTask = new WhileTask();
        whileTask.whileTest();

        System.out.println();
        ForTask forTask = new ForTask();
        forTask.forTest();

        System.out.println();
        ArrayTask arrayTask = new ArrayTask();
        arrayTask.arrayTest();
    }
}
