package JavaCore.level3.lecture11;

import java.io.*;

public class WriterFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");
            if (line.equals("exit")) {
                break;
            }
        }
        writer.close();
    }
}

