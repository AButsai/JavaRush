package level4.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task8 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int a = Integer.parseInt(reader.readLine());
       int b = Integer.parseInt(reader.readLine());
       int c = Integer.parseInt(reader.readLine());
        if ((a + b) > c && (a + c) > b && (c + b) > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
