package level8.lecture11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        //напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> set = new HashSet<>();
        Iterator c = cats.iterator();
        Iterator d = dogs.iterator();
        while (c.hasNext()) {
            set.add(c.next());
        }
        while (d.hasNext()) {
            set.add(d.next());
        }
        //напишите тут ваш код
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
       pets.removeAll(cats);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object o : pets) {
            System.out.println(o);
        }
        //напишите тут ваш код
    }

    public static class Cat {

    }

    public static class Dog {

    }
    //напишите тут ваш код
}
