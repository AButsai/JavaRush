package JavaCore.level9.lecture5.task1ЧетныеСимволы;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = reader.readLine();
        String fileOut = reader.readLine();
        reader.close();

        ArrayList<Integer> list = new ArrayList<>();
        FileReader fileReader = new FileReader(fileIn);
        FileWriter fileWriter = new FileWriter(fileOut);

        while (fileReader.ready()) {
            int i = fileReader.read();
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) % 2 == 0) {
                fileWriter.write(list.get(i));
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
