package pretask;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            x++;
        }
        System.out.println("X after increment: " + x);

        for (int i = 0; i < 3; i++) {
            x--;
        }
        System.out.println("X after decrement: " + x);
    }
}
