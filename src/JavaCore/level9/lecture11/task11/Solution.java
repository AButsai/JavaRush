package JavaCore.level9.lecture11.task11;

import java.io.*;

/*                                                   
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            System.out.println(new StringBuffer(s).reverse().toString());
        }
    }
}
