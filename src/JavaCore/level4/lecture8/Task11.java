package JavaCore.level4.lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      if (a <= 0 || b <= 0) {
          throw new Exception();
      } else {
          while (b != 0) {
              int tmp = a % b;
              a = b;
              b = tmp;
          }
      }
        System.out.println(a);
    }
}
