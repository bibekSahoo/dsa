package Rough;

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        final int[] array = new int[10];
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = i;
                    System.out.println("Producer produced: " + i);
                }
                lock.notify(); // notify waiting thread
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // wait for notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Consumer consumed: " + array[i]);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
