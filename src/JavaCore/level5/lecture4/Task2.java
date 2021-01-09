package JavaCore.level5.lecture4;

public class Task2 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int i) {
        System.out.println(i);
    }
    public static void printMatrix(double d) {
        System.out.println(d);
    }
    public static void printMatrix(char c) {
        System.out.println(c);
    }
    public static void printMatrix(short s) {
        System.out.println(s);
    }
    public static void printMatrix(String s) {
        System.out.println(s);
    }
    public static void printMatrix(Object o) {
        System.out.println(o);
    }
    public static void printMatrix(boolean b) {
        System.out.println(b);
    }
    public static void printMatrix(byte b) {
        System.out.println(b);
    }
}
