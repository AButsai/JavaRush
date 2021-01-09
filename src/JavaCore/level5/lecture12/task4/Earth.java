package JavaCore.level5.lecture12.task4;

public class Earth implements Planet {
    private static Earth instance;
    private Earth() {}

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
