package level8.lecture8;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "j");
        map.put("b", "j");
        map.put("c", "k");
        map.put("d", "i");
        map.put("e", "t");
        map.put("f", "t");
        map.put("g", "j");
        map.put("h", "k");
        map.put("j", "o");
        map.put("k", "l");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
       for (Map.Entry<String, String> pair : map.entrySet()) {
           if (pair.getValue().equals(name)) {
               count++;
           }
       }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int key = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                key++;
            }
        }
        return key;
    }

    public static void main(String[] args) {
    }
}
