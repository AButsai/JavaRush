package level4.lecture2;

public class Task1 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }

    public static class Cat {
        private String name = "безымянный кот";
        public void setName(String name) {
            this.name = name;
        }
    }
}
