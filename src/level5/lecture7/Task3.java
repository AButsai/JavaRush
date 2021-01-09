package level5.lecture7;

public class Task3 {
    public static void main(String[] args) {

    }

    public static class Dog {
        private String name;
        private int height;
        private String color;

        public void initialize(String name) {
            this.name = name;
        }

        public void initialize(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public void initialize(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }
}
