package level6.lecture8;

public class Task4 {
    public static void main(String[] args) {

        int x1 = 9;
        int y1 = 8;
        int x2 = 10;
        int y2 = 11;
        System.out.println(getDistance(x1, y1, x2, y2));
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double i = x1 - x2;
        double j = y1 - y2;

        return Math.sqrt(i * i + j * j);
    }
}
