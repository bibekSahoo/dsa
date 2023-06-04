package Thread;

public class ValidateWaitNotify {

    public static void main(String[] args) throws InterruptedException {
        ChildThread childThread = new ChildThread();
        childThread.start();
//        Thread.sleep(3000);
        synchronized (childThread){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Main Thread calling wait method");
            try {
                childThread.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Main thread got notified");
            System.out.println(childThread.total);
        }
    }
}

class ChildThread extends Thread{
    int total = 0;

    @Override
    public void run() {
        System.out.println("Started running the child thread..");
        synchronized (this) {
            System.out.println("Now Got the lock");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child thread starts execution..");
            for (int i = 0; i < 100; i++) {
                total+=i;
            }
            System.out.println("Finished execution..");
            this.notify();
        }
    }
}