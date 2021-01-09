package JavaCore.level10.lecture4.task2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
Как сериализовать JavaRush?
*/

public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {
    }
}
