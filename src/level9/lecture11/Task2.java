package level9.lecture11;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
