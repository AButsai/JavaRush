package level7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] street = new int[15];
        int a = 0;
        int b = 0;
        for (int i = 0; i < street.length; i++) {
            street[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                a += street[i];
            } else {
                b += street[i];
            }
        }

        if (a > b) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
