package Thread;

public class WordPrinter {
    private String word;
    private int index;
    
    public WordPrinter(String word) {
        this.word = word;
        this.index = 0;
    }
    
    public void printCharacter() {
        synchronized (this) {
            while (index < word.length()) {
                System.out.println(Thread.currentThread().getName() + ": " + word.charAt(index) + " at position " + index);
                index++;
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
    
    public static void main(String[] args) {
        WordPrinter wp = new WordPrinter("HelloWorld");
        Thread t1 = new Thread(() -> wp.printCharacter(), "Thread 1");
        Thread t2 = new Thread(() -> wp.printCharacter(), "Thread 2");
        t1.start();
        t2.start();
    }
}
