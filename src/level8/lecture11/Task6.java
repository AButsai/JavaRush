package level8.lecture11;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {

        Human son1 = new Human("Вася", true, 7);
        Human son2 = new Human("Петя", true, 5);
        Human daughter = new Human("Соня", false, 3);
        Human mom = new Human("Вика", false, 35, son1, son2, daughter);
        Human dad = new Human("Витя", true, 36, son1, son2, daughter);
        Human grandpa1 = new Human("Гриша", true, 58, mom);
        Human grandpa2 = new Human("Витя", true, 59, dad);
        Human grandma1 = new Human("Маша", false, 55, mom);
        Human grandma2 = new Human("Лара", false, 57, dad);


        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
        System.out.println(mom.toString());
        System.out.println(dad.toString());
        System.out.println(grandpa1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human ... humans) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, humans);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
