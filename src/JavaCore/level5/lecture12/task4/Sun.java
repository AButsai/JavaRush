package JavaCore.level5.lecture12.task4;

public class Sun implements Planet {
    private static Sun instance;
    private Sun() {}

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
