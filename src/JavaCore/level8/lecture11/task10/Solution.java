package JavaCore.level8.lecture11.task10;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));

        String fileId = reader1.readLine();
        int id = Integer.parseInt(args[0]);
        while (!fileId.equals("")) {
            if (Integer.parseInt(fileId.split(" ")[0]) == id) {
                System.out.println(fileId);
                break;
            }
            fileId = reader1.readLine();
        }


        reader.close();
        reader1.close();
    }
}
