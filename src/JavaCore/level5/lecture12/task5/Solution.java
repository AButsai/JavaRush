package JavaCore.level5.lecture12.task5;

public class Solution {
    private int count;
    protected String aString;
    private double aDouble;
    char aChar;

    private Solution(int count) {
        this.count = count;
    }

    Solution(String aString) {
        this.aString = aString;
    }

    public Solution(double aDouble) {
        this.aDouble = aDouble;
    }

    protected Solution(char aChar) {
        this.aChar = aChar;
    }

    public static void main(String[] args) {

    }
}
