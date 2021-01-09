package JavaCore.level10.lecture7.task3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

/*
Externalizable Person
*/

public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeChars(firstName);
            out.writeChars(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readLine();
            lastName = (String) in.readLine();
            father = (Person) in.readObject();
            mother = (Person) in.readObject();
            age = (int) in.readInt();
            children = (List<Person>) in.readObject();
        }
    }

    public static void main(String[] args) {

    }
}