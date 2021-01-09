package level8.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i ++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int max = 1;
        int counter = 1;
        int check = list.get(0);

        for(int j = 1; j < 10; j ++) {
            if (check == list.get(j)) {
                counter ++;
            } else {
                counter = 1;
            }
            check = list.get(j);
            if(counter > max) {
                max = counter;
            }
        }
        System.out.println(max);
    }
}
