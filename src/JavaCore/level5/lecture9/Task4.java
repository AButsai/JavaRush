package JavaCore.level5.lecture9;

public class Task4 {
    public static int A = 0;

    static {

            int c = 5 / A;
        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
