package level7.lecture12;

public class Task6 {
    public static void main(String[] args) {
        Human human1 = new Human("A", true, 22);
        Human human2 = new Human("B", false, 23);
        Human human3 = new Human("C", true, 21);
        Human human4 = new Human("D", false, 25);
        Human human5 = new Human("E", true, 5, human1, human2);
        Human human6 = new Human("F", false, 4, human1, human2);
        Human human7 = new Human("J", false, 8, human3, human4);
        Human human8 = new Human("H", true, 6, human3, human4);
        Human human9 = new Human("L", false, 4, human3, human4);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
