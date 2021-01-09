package JavaCore.level2.lecture6;

public class Task4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Cow";
        }
    }
}
