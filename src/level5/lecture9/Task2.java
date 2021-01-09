package level5.lecture9;

public class Task2 {
    public static void main(String[] args) {

    }

    static class Cat {
        private String name;
        private int age;
        private int weight;
        private String address;
        private String color;

        public Cat(String name) {
            this.name = name;
            this.age = 5;
            this.weight = 7;
            this.color = "black";
        }

        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "black";
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 7;
            this.color = "black";
        }

        public Cat(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.age = 5;
        }

        public Cat(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
            this.age = 5;
        }
    }
}
