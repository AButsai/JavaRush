package JavaCore.level8.lecture11.task9;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        Arrays.sort(bytes);

        HashMap<Byte, Integer> list = new HashMap<>();

        int count;
        for (byte b : bytes) {
            count =0;
            for (byte b1 : bytes) {
                if (b == b1) {
                    count++;
                }
            }
            if (!list.containsKey(b)) {
                list.put(b, count);
                System.out.println((char) b + " " + count);
            }
        }
        inputStream.close();
    }
}
