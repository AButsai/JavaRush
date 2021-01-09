package level2.lecture10.muzei;

public class Atrifact {
    private int serialNumber;
    private String theCulture;
    private int century;

    public Atrifact(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Atrifact(int serialNumber, String theCulture) {
        this.serialNumber = serialNumber;
        this.theCulture = theCulture;
    }

    public Atrifact(int serialNumber, String theCulture, int century) {
        this.serialNumber = serialNumber;
        this.theCulture = theCulture;
        this.century = century;
    }
}
