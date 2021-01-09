package level9.lecture6;

public class Task2 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
