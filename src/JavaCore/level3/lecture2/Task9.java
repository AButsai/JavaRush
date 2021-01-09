package JavaCore.level3.lecture2;

public class Task9 {
    public static void main(String[] args) {

    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly speed);
    }
}
