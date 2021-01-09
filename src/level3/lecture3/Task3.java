package level3.lecture3;

public class Task3 {
    public static double addTenPercent(int i) {
        return (double) i / 100 * 10 + i;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
