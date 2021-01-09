package JavaCore.level9.lecture5.task2СчитаемСлово;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        br.close();

        FileReader fr = new FileReader(s1);

        int count = 0;
        StringBuilder str = new StringBuilder();

        while (fr.ready()) {
            char symbol = (char) fr.read();
            str.append(String.valueOf(symbol).toLowerCase());
        }

        str = new StringBuilder(str.toString().replaceAll("\\p{Punct}", " "));
        str = new StringBuilder(str.toString().replaceAll("\n", " "));

        String[] mas = str.toString().split(" ");
        for (String s : mas) {
            s = s.trim();
            if (s.equals("world")) {
                count++;
            }
        }

        System.out.println(count);
        fr.close();
    }
}
