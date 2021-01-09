package JavaCore.level2.lecture6;

public class Task5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat {
        public String getName() {
            return "Cat";
        }

        public Pet getChild() {
            return null;
        }
    }

    public static class Dog {
        public String getName() {
            return "Dog";
        }

        public Pet getChild() {
            return null;
        }
    }
}
