package level8.lecture8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(55);
        set.add(41);
        set.add(56);
        set.add(58);
        set.add(10);
        set.add(9);
        set.add(8);
        set.add(22);
        set.add(33);
        set.add(37);
        set.add(7);
        set.add(6);
        set.add(42);
        set.add(46);
        set.add(32);
        set.add(11);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        set.removeIf(b -> b > 10);
        return set;
    }

    public static void main(String[] args) {
        for (Integer i : removeAllNumbersGreaterThan10(createSet())) {
            System.out.println(i);
        }
    }
}
