package JavaCore.level2.lecture9;

public class Task3 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public static class Dog implements CanMove, CanEat {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public static class Car implements CanMove {

        @Override
        public void move() {

        }
    }

    public static class Duck implements CanMove, CanEat, CanFly {

        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public static class Airplane implements CanFly, CanMove {

        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
