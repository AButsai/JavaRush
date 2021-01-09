package JavaCore.level5.lecture9;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(5.5, "A");
        labels.put(5.6, "A");
        labels.put(5.7, "A");
        labels.put(5.8, "A");
        labels.put(5.9, "A");
    }
}
