package JavaCore.level8.lecture8.task4;

import java.io.*;

public class TxtInputStream extends FileInputStream {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static FileInputStream fileInputStream;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        TxtInputStream txtInputStream = new TxtInputStream(br.readLine());
    }
}
