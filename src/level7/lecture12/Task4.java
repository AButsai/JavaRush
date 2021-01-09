package level7.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String str = reader.readLine();
            if (str.equals("end")) {
                break;
            }
            list.add(str);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
