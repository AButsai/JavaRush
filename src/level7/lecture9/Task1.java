package level7.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer integer : list) {
            if (integer % 3 == 0) {
                list3.add(integer);
            }
            if (integer % 2 == 0) {
                list2.add(integer);
            }
            if (integer % 3 != 0 && integer % 2 != 0) {
                list1.add(integer);
            }
        }

        printList(list3);
        printList(list2);
        printList(list1);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
