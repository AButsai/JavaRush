package JavaCore.level8.lecture3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        List<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }

        Collections.sort(list);
        int ncurrent = 0;
        int nmin = list.size();

        List<Integer> fin = new ArrayList<>();

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                ncurrent++;
            } else {
                if (ncurrent < nmin) {
                    fin.clear();
                    fin.add(list.get(i));
                    nmin = ncurrent;
                } else if (ncurrent == nmin) {
                    fin.add(list.get(i));
                }
                ncurrent = 0;
            }
        }
        for (int x : fin)
            System.out.print(x + " ");

        reader.close();
        fileInputStream.close();
    }
}
