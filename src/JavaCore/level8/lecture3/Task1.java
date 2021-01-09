package JavaCore.level8.lecture3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла:");
        String file = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file);

        int maxByte = 0;
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (maxByte < i) {
                maxByte = i;
            }
        }
        System.out.println(maxByte);
        reader.close();
        fileInputStream.close();
    }
}
