package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadTask4 {
    public static void main(String[] args) {
        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 1; i <= 380; i++) {
            mouseList.add(new Mouse(i));
        }

        for (int t = 0; t < 7; t++) {
            new Thread(() -> {
                while (true) {
                    Mouse mouseToPeep;
                    synchronized (mouseList) {
                        if (mouseList.isEmpty()) {
                            break;
                        }
                        mouseToPeep = mouseList.remove(0);
                    }
                    try {
                        mouseToPeep.peep();
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.err.println("Thread interrupted with error: " + e);
                    }
                }
            }).start();
        }
    }
}
