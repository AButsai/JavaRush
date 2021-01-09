package JavaCore.level5.lecture12.task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(result);

    }

    static {
        result = null;
        reset();
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("helicopter")) {
            result = new Helicopter();
        } else if (type.equals("plane")) {
            int pass = scanner.nextInt();
            result = new Plane(pass);
        }
        scanner.close();
        //add your code here - добавьте код тут
    }
}
