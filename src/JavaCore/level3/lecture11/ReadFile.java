package JavaCore.level3.lecture11;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            System.out.println((char) inputStream.read());
        }

        inputStream.close();
        reader.close();
    }
}
