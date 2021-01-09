package JavaCore.level8.lecture5;

import java.io.*;

public class Task5 {
    public static void main(String[] args) throws IOException, DownloadException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            FileInputStream fileInputStream = new FileInputStream(br.readLine());
            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                throw new DownloadException();
            }
        }
    }
    public static class DownloadException extends Exception {

    }
}
