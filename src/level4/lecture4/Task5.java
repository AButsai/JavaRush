package level4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if (i == 0) {
            System.out.println(0);
        } else if (i < 0) {
            System.out.println(i + 1);
        } else {
            System.out.println(i * 2);
        }
    }
}
