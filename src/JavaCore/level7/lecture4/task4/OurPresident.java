package JavaCore.level7.lecture4.task4;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }
}
