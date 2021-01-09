package JavaCore.level9.lecture11.task8;



/*
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);

        String fileReaderLine;
        String[] line;

        while ((fileReaderLine = fileReader.readLine()) != null) {
            line = fileReaderLine.split(" ");
            for (String s : line) {
                if (s.matches(".+[0-9].+")) {
                    fileWriter.write(s + " ");
                    System.out.println(s);
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
