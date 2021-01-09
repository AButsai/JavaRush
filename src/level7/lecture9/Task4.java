package level7.lecture9;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> string = new ArrayList<String>();
        for (String s : strings) {
            if (s.contains("р") && s.contains("л")) {
                string.add(s);
            } else if (s.contains("р")) {
                //NOP
            } else if (s.contains("л")) {
                string.add(s);
                string.add(s);
            } else {
                string.add(s);
            }
        }
        return string;
    }
}

