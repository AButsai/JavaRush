package level3.lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(bufferedReader.readLine());
        String name = bufferedReader.readLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
