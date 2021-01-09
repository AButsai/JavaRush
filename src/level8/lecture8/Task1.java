package level8.lecture8;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static Set<String> createSet() {
        Set set = new HashSet();
        set.add("Л");
        set.add("Лд");
        set.add("Ло");
        set.add("Лш");
        set.add("Лр");
        set.add("Ла");
        set.add("Лов");
        set.add("Ле");
        set.add("Лев");
        set.add("Лис");
        set.add("Лева");
        set.add("Лево");
        set.add("Лес");
        set.add("Лад");
        set.add("Литр");
        set.add("Лук");
        set.add("Луг");
        set.add("Луга");
        set.add("Лгун");
        set.add("Лье");
        return set;
    }

    public static void main(String[] args) {
        System.out.println(createSet().size());
    }

}
