package level6.lecture8;

public class Task3 {
    public static void main(String[] args) {

    }

    public static class Cat {
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
            return catCount;
        }

        public static void setCatCount(int catCount) {
            Cat.catCount = catCount;
        }
    }
}
