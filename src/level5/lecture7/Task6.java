package level5.lecture7;

public class Task6 {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Vasya", 21);
    }

    public static class Person {
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
