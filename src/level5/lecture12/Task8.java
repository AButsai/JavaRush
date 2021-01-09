package level5.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int l = Integer.parseInt(reader.readLine());
                if (l > maximum) {
                    maximum = l;
                }
            }
            System.out.println(maximum);
        }
    }
}
