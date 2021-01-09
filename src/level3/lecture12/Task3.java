package level3.lecture12;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    private static int sumDigitsInNumber(int number) {
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        return ((number / 100) + ((number / 10) % 10) + (number % 10));
    }
}
