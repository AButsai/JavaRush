package JavaCore.level3.lecture11;

public class Task8 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    static class Screen implements Updatable {
        @Override
        public void onSelect() {}
        @Override
        public void refresh() {}

    }
}
