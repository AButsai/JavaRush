package JavaCore.level5.lecture12;


import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            s = sc.nextLine();
            if (s.equals("exit")) {
                break;
            } else {
                try {
                    if (s.contains(".")) {
                        print(Double.parseDouble(s));
                    } else {
                        int i = Integer.parseInt(s);
                        if (i > 0 && i < 128) {
                            print((short) i);
                        } else {
                            print(i);
                        }
                    }
                } catch (NumberFormatException nfe) {
                    print(s);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
