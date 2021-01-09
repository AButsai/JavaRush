package level2.lecture8;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
         return (double) earthWeight / 100 * 17;
    }
}
