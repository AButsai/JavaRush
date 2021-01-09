package level7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrays = new int[10];
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 0; i < array.length; i++) {
            arrays[i] = array[i].length();
        }
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }
}
