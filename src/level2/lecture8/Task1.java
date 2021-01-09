package level2.lecture8;

public class Task1 {
    public static int min(int a, int b) {
        int i;
        if (a < b) {
            i = a;
        } else {
            i = b;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
