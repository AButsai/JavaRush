package level3.lecture3;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 1.3));
        System.out.println(convertEurToUsd(50, 1.3));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
