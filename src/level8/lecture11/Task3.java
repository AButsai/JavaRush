package level8.lecture11;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "s");
        map.put("a", "s");
        map.put("c", "s");
        map.put("v", "s");
        map.put("b", "s");
        map.put("h", "s");
        map.put("r", "s");
        map.put("d", "d");
        map.put("a", "f");
        map.put("t", "d");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
