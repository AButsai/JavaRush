package JavaCore.level7.lecture10.task12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла №1");
        String file = reader.readLine();
        System.out.println("Введите имя файла №2");
        String file1 = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        while ((s = br.readLine()) != null) {
            allLines.add(s);
        }
        br.close();

        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        while ((s = br1.readLine()) != null) {
            forRemoveLines.add(s);
        }
        br1.close();

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException c) {
            c.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
//        res//text.txt
//        res//text.txt