package level8.lecture8;

import java.util.*;

public class Task5 {
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List names = new ArrayList(map.values());
        for(int i = 0; i < names.size() -1 ; i++) {
            for(int j = i+1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    removeItemFromMapByValue(map, (String) names.get(i));
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
