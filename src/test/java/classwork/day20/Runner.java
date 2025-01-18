package classwork.day20;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        JsonParser jsonParser = new JsonParser();
        jsonParser.toJson();

        jsonParser.fromJson();
    }
}
