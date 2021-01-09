package JavaCore.level8.lecture11.task8;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        reader.close();

        while (inputStream.available() > 0) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            String[] strDouble = new String(bytes).split(" ");
            StringBuilder strBuld = new StringBuilder(bytes.length);

            for (String str : strDouble) {
                strBuld.append(Math.round(Double.parseDouble(str)));
                strBuld.append(" ");
            }
            outputStream.write(strBuld.toString().getBytes());
        }
        inputStream.close();
        outputStream.close();
    }
}
