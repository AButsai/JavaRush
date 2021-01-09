package level5.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма")) {
               break;
            }
            int j = Integer.parseInt(s);
            i += j;
        }
        System.out.println(i);
    }
}
