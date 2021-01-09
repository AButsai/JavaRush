public class Test2 {
    public static void main(String[] args) {
        System.out.println(leapYearCount(1));
        System.out.println(leapYearCount(4));
        System.out.println(leapYearCount(100));
        char c = '\u03A9';
        System.out.println(c);
        System.out.println(doubleExpression(0.1, 0.2, 0.3));

        System.out.println(flipBit(0, 1));
    }

    public static int leapYearCount(int year) {
        return ((year / 4) - (year / 100) + (year / 400));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) < 0.0001;
    }

    public static int flipBit(int value, int bitIndex) {

        int mask = (int) Math.pow(2, bitIndex - 1);

        return value ^ mask;
    }
}
