package level5.lecture9;

public class Task4 {
    public static void main(String[] args) {

    }

    public static class Circle {
        private int centerX;
        private int centerY;
        private int radius;
        private int width;
        private int color;

        public Circle(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }
        public Circle(int centerX, int centerY, int radius, int width) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }
        public Circle(int centerX, int centerY, int radius, int width, int color) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }
    }
}
