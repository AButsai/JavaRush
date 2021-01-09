package JavaCore.level2.lecture9;

public class Task5 {
    public static void main(String[] args) {

    }

    public abstract static class Human implements CanRun, CanSwim {

    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

}
