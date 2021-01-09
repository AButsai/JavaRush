package level2.lecture8;

public class Task2 {
    public static int min(int a, int b, int c) {
        int i = 0;
        if (a <= b && a <= c) {
            i = a;
        } else if (b <= a && b <= c) {
            i = b;
        } else {
            i = c;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
