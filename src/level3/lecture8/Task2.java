package level3.lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int i = Integer.parseInt(reader.readLine());
        int j = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + i + " через " + j + " лет.");
    }
}
