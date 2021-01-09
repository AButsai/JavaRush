package level4.lecture16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a >= b && a <= c || a <= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b <= c || b <= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
