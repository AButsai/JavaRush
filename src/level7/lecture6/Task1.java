package level7.lecture6;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
