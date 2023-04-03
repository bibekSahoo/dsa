package Rough;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueT {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("bibek");
        pq.add("Sohum");
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
