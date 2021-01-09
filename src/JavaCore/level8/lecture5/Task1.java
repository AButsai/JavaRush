package JavaCore.level8.lecture5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Task1 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }


        inputStream.close();
        outputStream.close();
    }
}
