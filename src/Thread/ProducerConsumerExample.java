package Thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerExample {
    private static final int QUEUE_SIZE = 5;
    private static final Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {


        ThreadGroup threadGroup = new ThreadGroup("firstGroup");
        System.out.println(threadGroup.getName());
        System.out.println(threadGroup.getParent().getName());

        ThreadGroup threadGroup1 = new ThreadGroup(threadGroup, "secondGroup");

        Thread producer = new Thread(threadGroup1, new Producer(), "Producer");
        Thread consumer = new Thread(threadGroup1,new Consumer(), "Consumer");
        Lock lock = new ReentrantLock(Boolean.TRUE);
        lock.lock();

//        producer.start();
//        consumer.start();
    }

    static class Producer implements Runnable {
        public void run() {
            int i = 0;
            synchronized (queue) {
                while (true) {
                    if (queue.size() != QUEUE_SIZE) {
                        i++;
                        queue.add(i);
                        System.out.println("Produced: " + i);
                        if (queue.size() == QUEUE_SIZE) {
                            queue.notifyAll();
                        }
                    } else {
                        System.out.println("Queue is full, waiting...");
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }

    }

    static class Consumer implements Runnable {
        public void run() {
            while (true) {
                synchronized (queue) {
                    if (!queue.isEmpty()) {
                        while (!queue.isEmpty()) {
                            int num = queue.remove();
                            System.out.println("Consumed: " + num);
                            if (queue.isEmpty()) {
                                queue.notifyAll();
                            }
                        }
                    } else {
                        System.out.println("Queue is empty, waiting...");
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }

    }
}
