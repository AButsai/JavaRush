package level5.lecture9;

import javafx.scene.shape.Circle;

public class Task7 {
    public static void main(String[] args) {

    }

    public class Circle {
        public double x;
        public double y;
        public double radius;

        public Circle() {

        }

        public Circle(double x) {
            this.x = x;
        }

        public Circle(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }
}
