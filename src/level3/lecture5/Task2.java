package level3.lecture5;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(2));
    }

    public static int convertToSeconds(int hour) {
        return hour * 60 * 60;
    }
}
