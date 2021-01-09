package level5.lecture7;

public class Task7 {
    public static void main(String[] args) {

    }

    static class Person {
        String name;
        char sex;
        int money;
        int weight;
        double size;

        public void initialize(String name, int money, char sex, int weight, double size) {
            this.name = name;
            this.money = money;
            this.sex = sex;
            this.weight = weight;
            this.size = size;
        }
    }
}
