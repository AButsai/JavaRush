package level4.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();

        if (s.equals(s1)) {
            System.out.println("Имена идентичны");
        } else if (s.length() == s1.length()){
            System.out.println("Длины имен равны");
        }
    }
}
