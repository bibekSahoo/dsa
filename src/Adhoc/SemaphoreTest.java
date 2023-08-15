package Adhoc;

import java.time.LocalTime;
import java.util.concurrent.Semaphore;

class MyThread extends Thread {
    private Semaphore semaphore;
    private String threadName;

    public MyThread(Semaphore semaphore, String threadName) {
        this.semaphore = semaphore;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println(threadName + " is waiting to acquire semaphore");

            System.out.println("semaphore.getQueueLength(): "+semaphore.getQueueLength());
            semaphore.acquire();
            System.out.println(threadName + " has acquired semaphore "+ LocalTime.now());

            // Perform some work
            Thread.sleep(2000);

            System.out.println(threadName + " is releasing semaphore "+ LocalTime.now());
            semaphore.release();
            System.out.println(threadName + " has released semaphore "+ LocalTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // Initialize semaphore with 2 permits

        MyThread thread1 = new MyThread(semaphore, "Thread 1");
        MyThread thread2 = new MyThread(semaphore, "Thread 2");
        MyThread thread3 = new MyThread(semaphore, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
