package concurrent;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/29 11:04
 */
public class Novisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread{
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println("number = " + number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
