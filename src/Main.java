import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("oppo"));
        System.out.println(isPalindrome("integer"));
        System.out.println(isPalindrome("5566998855"));
        System.out.println(isPalindrome("123321"));
        isSumEven("21345");
        isSumEven("999");
    }
    private static void isSumEven(String numberAsString) {
        //write you code here
        int i = Integer.parseInt(numberAsString);
        int j = 0;
        while (i > 0) {
            j = j + i % 10;
            i = i / 10;
        }
        System.out.println(j);
    }
    private static boolean isPalindrome(String numberAsString) {
        //write you code here
        return numberAsString.equals(new StringBuilder(numberAsString).reverse().toString());
    }
}