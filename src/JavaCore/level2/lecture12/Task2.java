package JavaCore.level2.lecture12;

public class Task2 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Я - кот";
        }

        @Override
        public void setName(String name) {
            super.setName(name);
        }
    }
}
