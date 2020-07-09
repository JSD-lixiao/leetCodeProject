package concurrent;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/29 11:04
 */
public class Novisibility {
    private static boolean ready;
    private static int number;

    static {
        System.out.println("ready = " + ready);
        System.out.println("number = " + number);
    }

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            System.out.println("ready = " + ready);
            System.out.println("number = " + number);
            while (!ready) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
