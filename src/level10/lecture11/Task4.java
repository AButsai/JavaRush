package level10.lecture11;

public class Task4 {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i = 0; i < 40; i++) {
            System.out.println(s);
            s = s.substring(1);
        }
    }
}
