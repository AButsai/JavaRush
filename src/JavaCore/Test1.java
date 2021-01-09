package JavaCore;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file;
        FileInputStream fileInputStream = new FileInputStream("res/test2.txt");
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
