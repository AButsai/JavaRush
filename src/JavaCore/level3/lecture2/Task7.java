package JavaCore.level3.lecture2;

public class Task7 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements  SimpleObject<String> {

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
