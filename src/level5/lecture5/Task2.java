package level5.lecture5;

public class Task2 {
    public static void main(String[] args) {

    }

    public static class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }

        public boolean fight(Cat anotherCat) {
            int a = 0;
            int b = 0;
            if (this.age > anotherCat.age) {
                a++;
            } else if (this.age < anotherCat.age){
                b++;
            }
            if (this.weight > anotherCat.weight) {
                a++;
            } else if (this.weight < anotherCat.weight){
                b++;
            }
            if (this.strength > anotherCat.strength) {
                a++;
            } else if (this.strength < anotherCat.strength) {
                b++;
            } else {
                a++;
                b++;
            }
            return a > b;
        }
    }
}
