package JavaCore.level9.lecture11.task10;

import java.io.*;
import java.util.ArrayList;

/*
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        String line;

        ArrayList<String> list = new ArrayList<>();

        while ((line = file.readLine()) != null) {
            list.add(line);
        }
        file.close();

        StringBuilder stringBuffer = new StringBuilder();
        for (String str : list) {
            String[] strLine = str.split(" ");
            for (String str1 : strLine) {
                if (str1.length() > 6) {
                    stringBuffer.append(str1).append(" ");
                }
            }
        }

        String res = stringBuffer.toString().trim().replaceAll(" ", ",");

        fileWriter.write(res);
        fileWriter.close();
    }
}
