package level7.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        int[] array = new int[10];
        int[] arrays = new int[10];
        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(arr, 0, array, 0, 9);
        System.arraycopy(arr, 10, arrays, 0, 10);
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }
}
