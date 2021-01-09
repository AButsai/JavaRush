package JavaCore.level8.lecture11.task12;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;

        while (true) {
            String fileName = br.readLine();
            try {
                fileInputStream = new FileInputStream(fileName);
                fileInputStream.close();
            } catch (FileNotFoundException f) {
                System.out.println(fileName);
                break;
            }
        }
        br.close();
    }
}
