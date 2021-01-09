package level5.lecture7;

public class Task5 {
    public static void main(String[] args) {

    }

    public static class Rectangle {
        private int top;
        private int left;
        private int width;
        private int height;

        public void initialize(int height) {
           this.height = height;
        }
        public void initialize(int height, int left) {
            this.height = height;
            this.left = left;
        }
        public void initialize(int height, int left, int top) {
            this.height = height;
            this.left = left;
            this.top = top;
        }
        public void initialize(int height, int left, int top, int width) {
            this.height = height;
            this.left = left;
            this.top = top;
            this.width = width;
        }
    }
}
