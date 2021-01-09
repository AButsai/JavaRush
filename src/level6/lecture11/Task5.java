package level6.lecture11;

public class Task5 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription() {
            return "Hello";
        }
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }
}
