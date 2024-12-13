package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadTask2 {
    public static void main(String[] args) {
        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 1; i <= 18; i++) {
            mouseList.add(new Mouse(i));
        }

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                for (int j = 1; j < mouseList.size() + 1; j += 2) {
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
