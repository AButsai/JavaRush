package level4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int num = 0;

        if ( a >= 1)
            num = num + 1;
        if ( b >= 1)
            num = num + 1;
        if ( c >= 1)
            num = num + 1;
        System.out.println(num);
    }
}
