package level9.lecture6;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
