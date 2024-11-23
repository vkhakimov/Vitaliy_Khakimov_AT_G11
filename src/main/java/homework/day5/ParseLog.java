package homework.day5;

import java.util.HashMap;
import java.util.Map;

public class ParseLog {
    public static void parseAccessLog(String logText) {
        Map<String, int[]> accessResults = new HashMap<>();
        String[] lines = logText.split("\n");
        for (String line : lines) {
            String[] parts = line.split("\\s+");

            if (parts.length >= 3) {
                String ip = parts[1];
                String status = parts[2];

                accessResults.putIfAbsent(ip, new int[]{0, 0});

                if (status.equals("granted")) {
                    accessResults.get(ip)[0]++;
                } else if (status.equals("denied")) {
                    accessResults.get(ip)[1]++; // Increment "failed" counter
                }
            }
        }

        for (Map.Entry<String, int[]> entry : accessResults.entrySet()) {
            String ip = entry.getKey();
            int[] counts = entry.getValue();
            System.out.println("ip " + ip + ": ok - " + counts[0] + ", failed - " + counts[1] + ";");
        }
    }
}
