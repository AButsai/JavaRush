package level8.lecture11;

import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : array) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int num = Integer.parseInt(reader.readLine());
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
