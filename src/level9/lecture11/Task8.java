package level9.lecture11;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{4, 5, 6, 2, 7});
        list.add(new int[]{2, 4});
        list.add(new int[]{8, 3, 9, 5});
        list.add(new int[]{7, 8, 9, 4, 5, 6, 1});
        list.add(new int[0]);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
