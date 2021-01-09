package level2.lecture1;

public class Task1 {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    private static void print(String s) {

        for (int i = 0; i < 4; i++) {
            System.out.println(s);
        }
    }
}
