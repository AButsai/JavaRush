package level10.lecture4;

public class Main {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = new String("Hello World");
        System.out.println(s1);
        int x = 7;
        incrementNumber(x);
        System.out.println(x);

        Cat cat = new Cat(7);
        catLevelUp(cat);
        System.out.println(cat.getAge());
    }

    public static void catLevelUp(Cat cat) {
        cat.setAge(cat.getAge() + 1);
    }

    public static void incrementNumber(int x) {
        System.out.println(x++);
    }

    public static class Cat {
        int age;

        public Cat(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
