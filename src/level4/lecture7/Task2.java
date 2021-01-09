package level4.lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a % 2 == 0 && a < 10) {
            System.out.println("четное однозначное число");
        } else if (a < 10) {
            System.out.println("нечетное однозначное число");
        } else if (a % 2 == 0 && a < 100) {
            System.out.println("четное двузначное число");
        } else if (a < 100) {
            System.out.println("нечетное двузначное число");
        } else if (a % 2 == 0 && a <= 999) {
            System.out.println("четное трехзначное число");
        } else if (a <= 999) {
            System.out.println("нечетное трехзначное число");
        }
    }
}
