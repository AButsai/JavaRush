package level8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String city;
        Map<String, String> map = new HashMap<>();
        while (true) {
            city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            map.put(city, family);
        }
        city = reader.readLine();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(city)) {
                System.out.println(pair.getValue());
            }
        }

    }
}
