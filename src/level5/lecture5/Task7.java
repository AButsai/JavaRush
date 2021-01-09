package level5.lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        double j = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                break;
            }
            j += number;
            i++;
        }
        System.out.println(j / i);
    }
}
