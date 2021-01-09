package JavaCore.level5.lecture9;

public class Task5 {
    public static Cat cat;

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }

    static {
        cat = new Cat();
        cat.name = "Cat";

        System.out.println(cat.name);
    }
}
