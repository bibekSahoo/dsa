package Rough;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ResourcePoolExample {
    public static void main(String[] args) {
        int expectedConcurrentOrders = 100;
        Executor executor = Executors.newFixedThreadPool(expectedConcurrentOrders);
        final int MAX_RESOURCES = 3;
        final ResourcePool resourcePool = new ResourcePool(MAX_RESOURCES);

        // create three threads that will compete for resources
        Thread t1 = new Thread(() -> {
            try {
                resourcePool.acquire();
                System.out.println("Thread 1 acquired resource.");
                Thread.sleep(1000); // simulate using resource
                resourcePool.release();
                System.out.println("Thread 1 released resource.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                resourcePool.acquire();
                System.out.println("Thread 2 acquired resource.");
                Thread.sleep(2000); // simulate using resource
                resourcePool.release();
                System.out.println("Thread 2 released resource.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                resourcePool.acquire();
                System.out.println("Thread 3 acquired resource.");
                Thread.sleep(3000); // simulate using resource
                resourcePool.release();
                System.out.println("Thread 3 released resource.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // start the threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.shutdown();
    }

    static class ResourcePool {
        private int availableResources;

        public ResourcePool(int availableResources) {
            this.availableResources = availableResources;
        }

        public synchronized void acquire() throws InterruptedException {
            while (availableResources == 0) {
                System.out.println(Thread.currentThread().getName() + " is waiting for a resource.");
                wait();
            }
            availableResources--;
        }

        public synchronized void release() {
            availableResources++;
            System.out.println(Thread.currentThread().getName() + " released a resource.");
            notify();
        }
    }
}
