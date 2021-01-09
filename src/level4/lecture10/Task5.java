package level4.lecture10;

public class Task5 {
    public static void main(String[] args) {
       int i = 1;
       int j = 1;
       while (j != 11) {
           while (i != 11) {
               System.out.print(j * i + " ");
               i++;
           }
           System.out.println();
           j++;
           i = 1;
       }
    }
}
