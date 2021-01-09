package JavaCore.level5.lecture12;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        private double amount = 123d;

        @Override
        public Object getAmount() {
            return amount;
        }

        public Money getMoney() {
            return this;
        }
    }
}
