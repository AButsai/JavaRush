package JavaCore.level5.lecture6;

import java.io.Serializable;

public class Task1 {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert());
        System.out.println(me.askZapp());
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp() {
            return zapp.answerQuestion("When will the next update happen?");
        }

        String askHubert() {
            return hubert.answerQuestion("What do you think about com.javarush.task.task15.task1511?");
        }
    }
}
