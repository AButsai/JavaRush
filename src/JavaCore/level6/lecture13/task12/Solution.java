package JavaCore.level6.lecture13.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
        Thread thread2 = threads.get(1);
        thread2.start();
        //thread2.sleep();
        thread2.interrupt();

        Thread thread4 = threads.get(3);
        Message message = (Message) thread4;
        thread4.start();
        //thread4.sleep();
        message.showWarning();
        System.out.println(thread4.isAlive());
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
            try {
                this.join();
            } catch (Exception e) {
            }
        }

        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while (!current.interrupted()) {
            }
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            int i = 0;
            try {
                while (true) {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(i);
                        break;
                    }
                    int j = Integer.parseInt(s);
                    i += j;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
