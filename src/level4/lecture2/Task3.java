package level4.lecture2;

public class Task3 {
    public static void main(String[] args) {
        Cat.setCatsCount(5);
        System.out.println(Cat.catsCount);

    }

    public static class Cat {
        private static int catsCount = 0;

        public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
        }
    }
}
