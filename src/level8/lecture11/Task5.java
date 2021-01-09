package level8.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String str = " ";
        str = str + string.substring(0, 1).toUpperCase();
        for (int i = 1; i < string.length(); i++) {
            if (" ".equals(string.substring(i - 1, i))) {
                str = str + string.substring(i, i + 1).toUpperCase();
            } else {
                str = str + string.substring(i, i + 1);
            }
        }
        System.out.println(str);
    }
}
