package level2.lecture2;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {

        return (double) 9 / 5 * celsius + 32;
    }
}
