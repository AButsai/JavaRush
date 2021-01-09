package level8.lecture8;

import java.util.*;

public class Task6 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 500);
        map.put("b", 600);
        map.put("c", 700);
        map.put("d", 450);
        map.put("e", 300);
        map.put("f", 250);
        map.put("g", 650);
        map.put("h", 350);
        map.put("j", 699);
        map.put("k", 235);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int i = pair.getValue();
            if (i < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
