package level6.lecture8;

public class Task6 {
    public static void main(String[] args) {

        String s = "Amigo";
        System.out.println(StringHelper.multiply(s));
        System.out.println(StringHelper.multiply(s, 3));
    }

    public static class StringHelper {
        public static String multiply(String s) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                result.append(s);
            }
            //напишите тут ваш код
            return result.toString();
        }

        public static String multiply(String s, int count) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < count; i++) {
                result.append(s);
            }
            //напишите тут ваш код
            return result.toString();
        }
    }
}
