package level4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(reader.readLine());
        double n = d % 5;

        if ((d >= 0 && d < 3) || (n >= 0 && n < 3)) {
            System.out.println("зелёный");
        } else if ((d >= 3 && d < 4) || (n >= 3 && n < 4)) {
            System.out.println("жёлтый");
        } else if ((d >= 4 && d < 5) || (n >= 4 || n < 5)) {
            System.out.println("красный");
        }
    }
}
//"жёлтый""зелёный""красный"
