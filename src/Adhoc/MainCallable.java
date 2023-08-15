package Adhoc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Callable is done!";
    }
}

public class MainCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = new MyCallable();

        Future<String> future = executorService.submit(callable);

        // Check if the future task is done
        if (future.isDone()) {
            try {
                String result = future.get();
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Future task is still running...");
        }

        executorService.shutdown();
    }
}
