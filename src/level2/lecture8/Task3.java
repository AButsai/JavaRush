package level2.lecture8;

public class Task3 {
    public static int min(int a, int b, int c, int d) {
        int i = min(a, b);
        int j = Math.min(c, d);
        return Math.min(i, j);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -60, 40));
        System.out.println(min(-20, -50, -30, -40));
    }
}
