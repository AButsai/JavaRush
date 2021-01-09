package level9.lecture6;

public class Task1 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
