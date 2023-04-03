package Rough;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("IN thread class");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class implemetor {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("IN Main Method");
        }
    }
}
