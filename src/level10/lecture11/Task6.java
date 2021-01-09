package level10.lecture11;

public class Task6 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private char address;
        private float weight;
        private double height;

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(char address) {
            this.address = address;
        }

        public Human(float weight) {
            this.weight = weight;
        }

        public Human(double height) {
            this.height = height;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(boolean sex, char address) {
            this.sex = sex;
            this.address = address;
        }

        public Human(float weight, double height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, boolean sex, char address, float weight, double height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.weight = weight;
            this.height = height;
        }
    }
}
