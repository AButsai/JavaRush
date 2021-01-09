package JavaCore;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("res/test2.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        int i;
        while ((i = bufferedInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
