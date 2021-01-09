package JavaCore.level3.lecture4;
import java.awt.*;
public class Task3 {
    public static void main(String[] args) {

    }

    public abstract static class Fox implements Animal {

        public String getName() {
            return "Fox";
        }
    }

    public interface Animal {
        Color getColor();
    }
}
