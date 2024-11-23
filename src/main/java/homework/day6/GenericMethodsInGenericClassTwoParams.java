package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    // Method for one or two arguments
    public String genericMethodGenArgs(X x) {
        return "I received 1 argument of type: " + x.getClass().getSimpleName();
    }

    public String genericMethodGenArgs(X x, Y y) {
        return "I received 2 arguments of type: " + x.getClass().getSimpleName() + ", " + y.getClass().getSimpleName();
    }

    // Method to print message with string length information
    public void genericMethodHalfGenArgs(X x, String str) {
        System.out.println("I got an object of " + x.getClass().getSimpleName() + " and string with " + str.length() + " characters");
    }

    public void genericMethodHalfGenArgs(X x, Y y, String str) {
        System.out.println("I got an object of " + x.getClass().getSimpleName() + " and " + y.getClass().getSimpleName() + " and string with " + str.length() + " characters");
    }
}
