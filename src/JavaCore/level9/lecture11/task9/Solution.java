package JavaCore.level9.lecture11.task9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одинадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(br.readLine()));
        br.close();

        String line;
        ArrayList<String> list = new ArrayList<>();

        while ((line = fileReader.readLine()) != null) {
            list.add(line);
        }
        fileReader.close();

        for (String s : list) {
            String[] list1 = s.split(" ");
            for (int i = 0; i < list1.length; i++) {
                for (Map.Entry<Integer, String> pair : map.entrySet()) {
                    try {
                        int j = Integer.parseInt(list1[i]);
                        if (pair.getKey().equals(j)) {
                            list1[i] = pair.getValue();
                        }
                    } catch (NumberFormatException ignored) {
                        /*NOP*/
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String s1 : list1) {
                sb.append(s1).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
