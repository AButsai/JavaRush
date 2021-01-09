package JavaCore.level8.lecture11.task13;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, byte[]> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream("res/fileI.txt");
        String fileName;
        byte[] bytes;
        while (true) {
            fileName = br.readLine();
            if (fileName.equals("end")) {
                break;
            }
            fileInputStream = new FileInputStream(fileName);
            in = new BufferedReader(new FileReader(fileName));
            bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            map.put(fileName, bytes);
            fileInputStream.close();
        }
        for (Map.Entry<String, byte[]> pair : map.entrySet()) {
            fileOutputStream.write(pair.getValue());
            fileOutputStream.close();
        }
        br.close();

    }
}
//56 45 88 99 66 36 45 23 45 77 55 5645
//88 99 6636 45 2345 77 55
//res/f5.txt
//res/f3.txt
//res/f1.txt
//res/f4.txt
//res/f2.txt