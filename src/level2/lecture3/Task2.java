package level2.lecture3;

public class Task2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Max";
        Dog dog1 = new Dog();
        dog1.name = "Jack";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
    }

    public static class Dog {
        public String name;
    }
}

