package level6.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPapa = reader.readLine();
        Cat catGrandPapa = new Cat(grandPapa);

        String grandMama = reader.readLine();
        Cat catGrandMama = new Cat(grandMama);

        String papa = reader.readLine();
        Cat catPapa = new Cat(papa, null, catGrandPapa);


        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMama, null);

        String sun = reader.readLine();
        Cat catSun = new Cat(sun, catMother, catPapa);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catPapa);

        System.out.println(catGrandPapa);
        System.out.println(catGrandMama);
        System.out.println(catPapa);
        System.out.println(catMother);
        System.out.println(catSun);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            if (mother == null)
                return "The cat's name is " + name + ", no mother " + ", father is " + father.name;
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
