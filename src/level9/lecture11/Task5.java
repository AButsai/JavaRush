package level9.lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] ch = s.replace(" ", "").toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> notVowels = new ArrayList<>();
        for (char c : ch) {
            if (isVowel(c)) {
                vowels.add(c);
            } else {
                notVowels.add(c);
            }
        }
        for (Character c : vowels) {
            System.out.print(c + " ");
        }

        System.out.println();

        for (Character c : notVowels) {
            System.out.print(c + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
