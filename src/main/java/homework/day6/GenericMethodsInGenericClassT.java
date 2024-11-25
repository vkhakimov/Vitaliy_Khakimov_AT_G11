package homework.day6;

public class GenericMethodsInGenericClassT <T> {
    public void genericMethodOneGenArg(T o) {
        System.out.println("I'm object of " + o.getClass().getName() + " class.");
    }

    public <U, V> String genericMethodTwoGenArgs(U arg1, V arg2) {
        return "We are objects of " + arg1.getClass().getName() + " class and " + arg2.getClass().getName() + " class";
    }

    public void genericMethodHalfGenArgs(T arg, String str) {
        System.out.println("I got an object of " + arg.getClass().getName() + " class and string with " + str.length() + " characters");
    }
}
