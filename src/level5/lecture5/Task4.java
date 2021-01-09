package level5.lecture5;

public class Task4 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5, 12, 9);
        Cat cat1 = new Cat("Murzik", 4, 10, 7);
        Cat cat2 = new Cat("Boss", 6, 15, 11);

    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
