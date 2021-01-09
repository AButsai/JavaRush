package level7.lecture9;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> list = new ArrayList<>();
       int num = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                continue;
            }
            if (list.get(i - 1).length() > list.get(i).length()) {
                num = i;
                System.out.println(num);
                break;
            }
        }
    }
}
