package ModularArithmatic;

import java.util.HashMap;

/*Given N +ve array elements.  Calculate no of pairs i,j such that arr[i]+arr[j] % M = 0
Not i j and pair is same as pair j i */
public class FindPairs {
    // Bruteforce : Check each pair with 2 for loop and do %M and find the pair with modulo zero. O(N^2)

    public static void main(String[] args) {
        int totalPairs = 0;
        /* Take modulo of each number and keep how many times the same
        result of modulo came. Later to be used to calculate pairs*/
        int[] numbers = {2, 3, 4, 8, 6, 15, 5, 12, 17, 7, 18, 10, 9, 16, 21};
        int n = 6;
        HashMap<Integer, Integer> moduloRecord = new HashMap<>();
        for (int number : numbers) {
            int moduloResult = number % n;
            moduloRecord.put(moduloResult, moduloRecord.getOrDefault(moduloResult, 0) + 1);
        }
        System.out.println(moduloRecord);

        // Now lets calculate pairs
        int pairCalculator = moduloRecord.get(0);
        totalPairs += (pairCalculator * (pairCalculator - 1)) / 2;
        if (n % 2 == 0) {
            pairCalculator = moduloRecord.get(n / 2);
            totalPairs += (pairCalculator * (pairCalculator - 1)) / 2;
        }
        for (int i = 1 ; i < (n+1)/2 ; i++) {
            totalPairs += moduloRecord.get(i) * moduloRecord.get(n-i);
        }
        System.out.println("Total Pairs: "+totalPairs);
    }
}
