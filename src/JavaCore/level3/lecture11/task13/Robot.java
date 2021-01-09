package JavaCore.level3.lecture11.task13;

public class Robot extends AbstractRobot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
