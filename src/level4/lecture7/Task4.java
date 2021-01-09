package level4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int num = 0;
        int num1 = 0;
        if (a >= 1)
            num = num + 1;
        else if (a <= -1)
            num1 = num1 + 1;
        if ( b >= 1)
            num = num + 1;
        else if (b <= -1)
            num1 = num1 + 1;
        if ( c >= 1)
            num = num + 1;
        else if (c <= -1)
            num1 = num1 + 1;
        System.out.println("количество положительных чисел: " + num);
        System.out.println("количество отрицательных чисел: " + num1);
    }
}
