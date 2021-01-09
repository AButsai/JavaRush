package level5.lecture7;

public class Task2 {
    public static void main(String[] args) {

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private String address;
        private String color;

        public void initialize(String name) {
            this.name = name;
            this.age = 5;
            this.weight = 4;
            this.color = "grey";
        }

        public void initialize(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "grey";
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 4;
            this.color = "grey";
        }

        public void initialize(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.age = 8;
        }

        public void initialize(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
            this.age = 5;
        }
    }
}
