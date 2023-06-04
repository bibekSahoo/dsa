package Thread;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadOne extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("check.. ");
        System.out.println(Thread.currentThread().getName());
    }
}

public class BasicThread {
    public static void main(String[] args) {
        Runnable threadOne = new ThreadOne();
        Thread thread = new Thread(threadOne);
        thread.start();

        Executor executor = Executors.newFixedThreadPool(10);
        executor.execute(threadOne);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<?> hk = executorService.submit(threadOne);
        executorService.shutdown();
    }
}
