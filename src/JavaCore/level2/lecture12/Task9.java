package JavaCore.level2.lecture12;

public class Task9 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Human implements Businessman {

        @Override
        public void workHard() {

        }
    }

    public static class CTO extends Human implements Businessman {

    }
}
