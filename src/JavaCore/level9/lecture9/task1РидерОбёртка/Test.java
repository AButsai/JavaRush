package JavaCore.level9.lecture9.task1РидерОбёртка;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printSomething();
        String result = outputStream.toString().toUpperCase();
        System.setOut(consoleStream);
        //System.out.println(result);
        printSomething();
    }
    public static void printSomething() {
        System.out.println("hi");
        System.out.println("Hello");
    }
}
