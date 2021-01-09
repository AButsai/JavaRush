package JavaCore;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("res/test2.txt", true);
        String s = "Hello World!\r\n";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
    }
}
