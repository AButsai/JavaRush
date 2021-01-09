package level10.lecture11;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] lists = new ArrayList[5];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
            lists[i].add("a" + i);
        }

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
