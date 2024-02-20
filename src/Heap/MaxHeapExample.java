package Heap;

import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        // Creating a max heap using PriorityQueue with a custom comparator
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());// maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(); // minHeap

        // Inserting elements into the max heap
        maxHeap.add(4);
        maxHeap.add(7);
        maxHeap.add(2);
        maxHeap.add(9);
        maxHeap.add(1);

        // Removing elements (they will be removed in descending order, as it's a max heap)
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (Integer num:nums
             ) {
            minHeap.add(num);
        }
        while(minHeap.size() > k){
            minHeap.poll();
        }

        return minHeap.peek().intValue();
    }
}
