package JavaCore.level8.lecture5;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] buffer = new byte[inputStream.available()];
        if (inputStream.available() > 0) {
            inputStream.read(buffer);
        }

        byte[] buffer1 = new byte[buffer.length];
        for (int i = 0; i < buffer1.length; i++) {
            buffer1[i] = buffer[buffer.length - 1 - i];
        }
        outputStream.write(buffer1);

        inputStream.close();
        outputStream.close();
    }
}
