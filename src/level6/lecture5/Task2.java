package level6.lecture5;

public class Task2 {
    public static void main(String[] args) {

    }

    static class Cat {
       protected void finalize() throws Throwable {
           System.out.println();
       }
    }

    static class Dog {
        protected void finalize() throws Throwable {
            System.out.println();
        }
    }
}
