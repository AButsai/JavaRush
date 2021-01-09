package level6.lecture5;

public class Task4 {
    public static void main(String[] args) throws Throwable {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(Cat.catCount);
        cat.finalize();
        System.out.println(Cat.catCount);
    }

    static class Cat {
        public static int catCount = 0;

        public Cat() {
           catCount++;
        }

        protected void finalize() throws Throwable {
            catCount--;
        }
    }
}
