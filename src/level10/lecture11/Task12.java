package level10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(s);
            String name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
        //System.out.println("Id=" + id + " Name=" + name);
    }
}
