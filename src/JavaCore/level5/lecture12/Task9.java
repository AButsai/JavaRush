package JavaCore.level5.lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
