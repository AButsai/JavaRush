package level7.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
            if (min > arrayList.get(i).length()) {
                min = arrayList.get(i).length();
            }
            if (max < arrayList.get(i).length()) {
                max = arrayList.get(i).length();
            }
        }
        for (String s : arrayList) {
            if (s.length() == min) {
                System.out.println(s);
                break;
            }
            if (s.length() == max) {
                System.out.println(s);
                break;
            }
        }
    }
}
