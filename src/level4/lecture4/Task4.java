package level4.lecture4;

public class Task4 {
    public static void main(String[] args) {
        checkSeason(2);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month == 12 || month <= 2) {
            System.out.println("зима");
        } else if (month <= 5) {
            System.out.println("весна");
        } else if (month <= 8) {
            System.out.println("лето");
        } else {
            System.out.println("осень");
        }
    }
}
