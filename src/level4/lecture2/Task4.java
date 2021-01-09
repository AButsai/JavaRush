package level4.lecture2;

public class Task4 {
    public static void main(String[] args) {

    }

    public static class Cat {
        private String fullName;

        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            this.fullName = fullName;
        }
    }
}
