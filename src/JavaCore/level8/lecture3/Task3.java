package JavaCore.level8.lecture3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> letters = new HashMap<Byte, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(new File(file));
        byte[] buffer = new byte[in.available()];
        if (in.available() > 0) {
            in.read(buffer);
        }
        in.close();
        for (byte c : buffer) {
            int count = 0;
            for (byte c1 : buffer) {
                if (c == c1)
                    count++;
            }
            letters.put(c, count);
        }
        int maxByte = 0;
        for (Map.Entry<Byte, Integer> pair : letters.entrySet()) {
            if (pair.getValue() > maxByte)
                maxByte = pair.getValue();
        }
        for (Map.Entry<Byte, Integer> pair : letters.entrySet()) {
            if (pair.getValue().equals(maxByte))
                System.out.print(pair.getKey() + " ");
        }
    }
}
//     res//text.txt