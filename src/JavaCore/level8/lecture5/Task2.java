package JavaCore.level8.lecture5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Подсчет запятых
*/

public class Task2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(br.readLine());

        int count = 0;
        while (inputStream.available() > 0) {

            if (inputStream.read() == (byte) ',') {
                count++;
            }
        }

        inputStream.close();

        System.out.println(count);
    }
}
