package ArrayMaths;

import java.util.ArrayList;
import java.util.Collections;

/*
* Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
Output: Minimum Difference is 2
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
Output: Minimum Difference is 6 */
public class DistributionChocolate {
    private static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        Collections.sort(a);
        System.out.println(a);
        long minAnswer = Integer.MAX_VALUE;
        System.out.println( "size"+(n - m ));
        for (int i = 0; i <= n - m; i++) {
            System.out.println(i+m -1 +" : "+a.get(i + m -1));
            int minStart = a.get(i);
            int maxEnd = a.get(i + m - 1);
            minAnswer = Math.min(maxEnd - minStart, minAnswer);
        }
        return minAnswer;
    }

    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int value : arr) {
            arrayList.add(value);
        }
        System.out.println(findMinDiff(arrayList, arr.length, m));
    }
}
