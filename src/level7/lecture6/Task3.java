package level7.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int temp = Integer.MAX_VALUE;
        for (String string : strings) {
            if (string.length() < temp) {
                temp = string.length();
            }
        }
        for (String string : strings) {
            if (string.length() == temp) {
                System.out.println(string);
            }
        }
    }
}
