package level6.lecture11;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat.cats.add(new Cat());
        }
        Cat.printCats();
    }

    public static class Cat {
        private static ArrayList<Cat> cats = new ArrayList<>();
        private static Cat cat;

        public Cat() {
        }
        public static void printCats() {
            for (Cat value : cats) {
                System.out.println(value);
            }
        }
    }
}
