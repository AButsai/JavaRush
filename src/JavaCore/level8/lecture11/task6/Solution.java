package JavaCore.level8.lecture11.task6;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream(br.readLine());
        FileInputStream in = new FileInputStream(br.readLine());
        FileInputStream in1 = new FileInputStream(br.readLine());
        br.close();

        byte[] bytes = new byte[in.available()];
        byte[] bytes1 = new byte[in1.available()];

        while (in.available() > 0 && in1.available() > 0) {
            in.read(bytes);
            in1.read(bytes1);
        }

        out.write(bytes);
        out.write(bytes1);

        out.close();
        in.close();
        in1.close();
    }
}
