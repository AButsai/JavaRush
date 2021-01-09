package level7.lecture9;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("именно");
        list.add("мыла");
        list.add("именно");
        list.add("раму");
        list.add("именно");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
