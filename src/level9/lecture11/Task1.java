package level9.lecture11;

public class Task1 {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }

    }

    public static void divideByZero() {

        int a = 45 / 0;
        System.out.println(a);
    }
}
