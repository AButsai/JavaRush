package level8.lecture11;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        //напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c : cats) {
            System.out.println(c);
        }
        // step 4 - пункт 4
    }

    public static class Cat {

    }
    // step 1 - пункт 1
}
