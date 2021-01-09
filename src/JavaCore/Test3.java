package JavaCore;

import java.io.*;

public class Test3 {
    private static final String GM = "My name is %s, my age is %d";
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("res/test2.txt");
        PrintStream printStream = new PrintStream(new FileOutputStream(file));

        printStream.println("Hello!");
        printStream.println("We are robots!");

        printStream.printf(GM, "Amigo", 18);
        printStream.printf(GM, "R2-D2", 35);
        printStream.printf(GM, "c-3PO", 35);

        printStream.close();
    }
}
