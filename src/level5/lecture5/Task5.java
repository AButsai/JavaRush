package level5.lecture5;

public class Task5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5, 12, 9);
        Cat cat1 = new Cat("Murzik", 4, 10, 7);
        Cat cat2 = new Cat("Boss", 6, 15, 11);
        System.out.println(cat.fight(cat1));
        System.out.println(cat1.fight(cat2));
        System.out.println(cat.fight(cat2));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
