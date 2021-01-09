package level5.lecture9;

public class Task3 {
    public static void main(String[] args) {

    }

    static class Dog {
        private String name;
        private int height;
        private String color;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }
}
