package level9.lecture11;

import java.io.*;

public class Task11 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream fileInputStream;
        try {
            String sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            String sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }
        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
