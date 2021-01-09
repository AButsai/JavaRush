package JavaCore.level6.lecture10;

public class Task2 {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while (true) {
                try {
                    if (numSeconds>=1) {
                        System.out.print(numSeconds + " ");
                    } else {
                        System.out.println("Марш!");
                        break;
                    }
                    numSeconds--;
                    Thread.sleep(1000);
                } catch (InterruptedException i) {
                    System.out.println("Прервано!");
                    break;
                }
            }
        }
    }
}
