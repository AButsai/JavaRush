package level4.lecture2;

public class Task5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;
        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
