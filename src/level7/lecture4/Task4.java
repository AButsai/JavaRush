package level7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrays = new int[10];
        for (int i = 0; i < 10; i++) {
            arrays[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = arrays.length - 1; i >= 0 ; i--) {
            System.out.println(arrays[i]);
        }
    }
}
