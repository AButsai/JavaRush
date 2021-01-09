package level6.lecture5;

public class Task3 {
    public static void main(String[] args) throws Throwable {

        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            cat = null;
            Dog dog = new Dog();
            dog = null;
        }
    }

    static class Cat {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Cat was destroyed");
        }
    }

    static class Dog {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Dog was destroyed");
        }
    }
}
