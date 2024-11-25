package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTask2 {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            myList1.add("kek " + i);
            myList2.add("kek " + i);
        }

        long t0 = System.currentTimeMillis() * 10;
        for (int i = 0; i < myList1.size(); i++) {
            myList1.get(i);
        }
        long t1 = System.currentTimeMillis() * 10;
        long myList1T = t1 - t0;

        System.out.println("myList1 iteration time in millis x10: " + myList1T);

        t0 = System.currentTimeMillis() * 10;
        for (int i = 0; i < myList2.size(); i++) {
            myList2.get(i);
        }
        t1 = System.currentTimeMillis() * 10;
        long myList2T = t1 - t0;

        System.out.println("myList2 iteration time in millis x10: " + myList2T);
    }
}
