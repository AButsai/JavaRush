package level7.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String temp = arrayList.get(4);
            arrayList.remove(4);
            arrayList.add(0, temp);
        }
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
