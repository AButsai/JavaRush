package JavaCore.level8.lecture11.task7;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        FileInputStream in = new FileInputStream(name);
        FileInputStream in1 = new FileInputStream(name1);
        reader.close();

        byte[] bytes = new byte[in.available()];
        byte[] bytes1 = new byte[in1.available()];
        while (in.available() > 0) {
            in.read(bytes);
            in1.read(bytes1);
        }

        FileOutputStream out = new FileOutputStream(name);
        out.write(bytes1);
        out.write(bytes);

        in1.close();
        in.close();
        out.close();
    }
}
