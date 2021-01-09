package level6.lecture8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

    }

    public static class ConsoleReader {
        public static String readString() throws Exception {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        public static int readInt() throws Exception {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        public static double readDouble() throws Exception {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        }

        public static boolean readBoolean() throws Exception {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextBoolean();
        }
    }
}
