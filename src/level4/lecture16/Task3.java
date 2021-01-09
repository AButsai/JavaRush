package level4.lecture16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                break;
            }
            i += a;
        }
        System.out.println(i - 1);
    }
}
