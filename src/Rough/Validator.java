//package Rough;
//
//public class Validator {
//    public static void main(String[] args) throws InterruptedException {
//        creator creator = new creator("Bibek",);
//        creator.start();
//        System.out.println(Thread.currentThread().getName());
//        creator.interrupt();
//        secondCreator secondCreator = new secondCreator();
//        secondCreator.start();
//        System.out.println(Thread.currentThread().getName());
//
//    }
//}
//
//
//class creator extends Thread {
//    String name;
//    int charAt;
//
//    public creator(String name, int charAt) {
//        this.name = name;
//        this.charAt = charAt;
//    }
//
//    @Override
//    public void run() {
//        System.out.println(name.charAt(charAt));
//    }
//}
//class secondCreator extends Thread {
//    String name;
//    int charAt;
//
//    public secondCreator(String name, int charAt) {
//        this.name = name;
//        this.charAt = charAt;
//    }
//
//    @Override
//    public void run() {
//        System.out.println(name.charAt(charAt));
//    }
//}
//
