package level3.lecture4;

public class Task3 {
    public static void main(String[] args) {
        Zerg zerg = new Zerg();
        zerg.name = "a";
        Zerg zerg1 = new Zerg();
        zerg1.name = "n";
        Zerg zerg2 = new Zerg();
        zerg2.name = "c";
        Zerg zerg3 = new Zerg();
        zerg3.name = "d";
        Zerg zerg4 = new Zerg();
        zerg4.name = "e";

        Protoss protoss = new Protoss();
        protoss.name = "s";
        Protoss protoss1 = new Protoss();
        protoss1.name = "p";
        Protoss protoss2 = new Protoss();
        protoss2.name = "w";

        Terran terran = new Terran();
        terran.name = "l";
        Terran terran1 = new Terran();
        terran1.name = "o";
        Terran terran2 = new Terran();
        terran2.name = "y";
        Terran terran3 = new Terran();
        terran3.name = "q";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
