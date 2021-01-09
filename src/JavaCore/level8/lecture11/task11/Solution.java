package JavaCore.level8.lecture11.task11;

import java.io.*;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = br.readLine();
            if (fileName.equals("exit")) {
                break;
            } else {
                ReadThread rt = new ReadThread(fileName);
                rt.start();
                try {
                    rt.join();
                } catch (Exception e) {
                }
            }
        }
        br.close();
//        for (Map.Entry<String, Integer> pair : resultMap.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream in = new FileInputStream(fileName);
                int nextByte;
                int[] b = new int[256];
                while ((nextByte = in.read()) != -1) {
                    b[nextByte]++;
                }
                int i1 = 0;
                for (int i = 1; i < b.length; i++) {
                    if (b[i] > b[i1]) {
                        i1 = i;
                    }
                    synchronized (Solution.class) {
                        resultMap.put(fileName, i1);
                    }
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}