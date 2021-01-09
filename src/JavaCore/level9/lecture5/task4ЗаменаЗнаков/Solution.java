package JavaCore.level9.lecture5.task4ЗаменаЗнаков;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = reader.readLine();
        String fileOut = reader.readLine();
        reader.close();

        ArrayList<Character> list = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOut));

        while (fileReader.ready()) {
            int i = fileReader.read();
            list.add((char)i);
        }

        for (Character c : list) {
            fileWriter.write(c.toString().replaceAll("\\.", "!"));
        }

        fileReader.close();
        fileWriter.close();
    }
}
