package DesignPattern.Stratergy;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {

    public static <T> void printList(List list) {
        List<Object> objList = new ArrayList<>();
        List<String> objList1 = new ArrayList<>();
        List<?> wildcardList = objList1;
        objList.add(""); // works
//        wildcardList.add("");
//        System.out.println(list.get(0));
//        Executor executorService = Executors.newCachedThreadPool();
//        executorService.submit(() -> {
//            System.out.println("Bibek");
//        });
//        executorService.shutdown();
    }

    public static void main(String[] args) {
        printList(new ArrayList<>());
    }
}

