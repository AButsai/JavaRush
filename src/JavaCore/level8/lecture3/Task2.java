package JavaCore.level8.lecture3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла:");
        String file = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file);

        int minByte = Integer.MAX_VALUE;
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (minByte > i) {
                minByte = i;
            }
        }
        System.out.println(minByte);
        reader.close();
        fileInputStream.close();
    }
}
