package JavaCore.level8.lecture11.task4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;

// stream<str>
// str -> stream<int>
public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fIS = new FileInputStream(args[0]);
        long cnt = Files.lines(Paths.get(args[0]).normalize())
                .flatMap(s -> s.chars().boxed())
                .filter(c -> ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'))
                .count();
        System.out.println(cnt);
        fIS.close();
    }
}
