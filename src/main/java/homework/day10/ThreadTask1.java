package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadTask1 {
    public static void main(String[] str) {
        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mouseList.add(new Mouse(i));
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < mouseList.size(); j++) {
                    try {
                        mouseList.get(j).peep();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
