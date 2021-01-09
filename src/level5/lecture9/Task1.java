package level5.lecture9;

public class Task1 {
    public static void main(String[] args) {

    }

    static class Friend {
        private String name;
        private int age;
        private char sex;

        public Friend(String name) {
            this.name = name;
        }

        public Friend(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Friend(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
