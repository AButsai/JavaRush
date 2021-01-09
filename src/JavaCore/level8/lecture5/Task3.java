package JavaCore.level8.lecture5;

import java.io.*;

/*
Разделение файла
*/

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(br.readLine());
        FileOutputStream outputStream = new FileOutputStream(br.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(br.readLine());
        br.close();

        int fileSize;
        while (inputStream.available() > 0) {
            if (inputStream.available() % 2 == 0) {
                fileSize = inputStream.available() / 2;
            } else {
                fileSize = inputStream.available() / 2 + 1;
            }
            byte[] buffer = new byte[fileSize];
            outputStream.write(buffer, 0, inputStream.read(buffer));
            byte[] buffer1 = new byte[inputStream.available() / 2];
            outputStream1.write(buffer1, 0, inputStream.read(buffer1));
        }

        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
