package level9.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
       try {
           while (true) {
               list.add(Integer.parseInt(br.readLine()));
           }
       }
       catch (NumberFormatException | IOException e) {
           for (Integer i : list) {
               System.out.println(i);
           }
       }

    }
}
