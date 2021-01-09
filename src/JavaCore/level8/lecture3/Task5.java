package JavaCore.level8.lecture3;

import java.io.*;
import java.util.*;

public class Task5 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Set<Integer> set = new TreeSet<>();
        while (fileInputStream.available() > 0) {
            set.add(fileInputStream.read());
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        reader.close();
        fileInputStream.close();
    }
}
