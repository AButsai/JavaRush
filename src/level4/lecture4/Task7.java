package level4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Количество дней в году
*/
public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if (i % 400 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (i % 100 == 0) {
            System.out.println("количество дней в году: 365");
        } else if (i % 4 == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}
