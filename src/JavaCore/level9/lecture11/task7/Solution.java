package JavaCore.level9.lecture11.task7;

import java.io.*;
import java.util.*;

/*
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (bufferedReader.ready()) {
            String str = bufferedReader.readLine();
            String[] strings = str.split(" ");

            int count = 0;
            for (String s : strings) {
                if (words.contains(s)) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(str);
            }
        }
        bufferedReader.close();
    }
}
