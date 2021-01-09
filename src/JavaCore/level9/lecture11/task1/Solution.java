package JavaCore.level9.lecture11.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/
public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        List<String> fileLines1 = readFiles(file1);
        List<String> fileLines2 = readFiles(file2);

        int f1 = 0;
        int f2 = 0;

       while (f1 < fileLines1.size() && f2 < fileLines2.size()) {
           if (fileLines1.get(f1).equals(fileLines2.get(f2))) {
               lines.add(new LineItem(Type.SAME, fileLines1.get(f1)));
               f1++;
               f2++;
           } else if (fileLines1.size() > f1 + 1 && fileLines1.get(f1 + 1).equals(fileLines2.get(f2))) {
               lines.add(new LineItem(Type.REMOVED, fileLines1.get(f1)));
               f1++;
           } else if (fileLines2.size() > f2 + 1 && fileLines2.get(f2 + 1).equals(fileLines1.get(f1))) {
               lines.add(new LineItem(Type.ADDED, fileLines2.get(f2)));
               f2++;
           }
       }

       if (f1 < fileLines1.size()) {
           lines.add(new LineItem(Type.REMOVED, fileLines1.get(f1)));
       }
       if (f2 < fileLines2.size()) {
           lines.add(new LineItem(Type.ADDED, fileLines2.get(f2)));
       }
    }

    public static List<String> readFiles(BufferedReader file) throws IOException {
        List<String> list = new ArrayList<>();
        while (file.ready()) {
            list.add(file.readLine());
        }
        file.close();
        return list;
    }

    public static enum Type {
        ADDED,
        REMOVED,
        SAME
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
