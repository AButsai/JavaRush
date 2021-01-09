package JavaCore.level2.lecture12;

public class Task6 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public static class Cat implements CanClimb, CanRun {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public static class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public static class Tiger extends Cat {
    }

    public static class Duck implements CanRun, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
