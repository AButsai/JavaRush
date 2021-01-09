package level9.lecture2;

public class Task5 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int deep = 0;
        for (StackTraceElement element : elements) {
            deep++;
        }
        System.out.println(deep);
        return deep;
    }
}
