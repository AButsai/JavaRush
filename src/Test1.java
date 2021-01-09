public class Test1 {
    public static void main(String[] args) {
        System.out.println(booleanExpression(false, false, true, true));
        System.out.println(booleanExpression(true, false, true, false));
        System.out.println(booleanExpression(true, true, true, true));
        System.out.println(booleanExpression(false, false, false, false));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;
        if (a) {
            count++;
        }
        if (b) {
            count++;
        }
        if (c) {
            count++;
        }
        if (d) {
            count++;
        }
        return count == 2;
    }
}
