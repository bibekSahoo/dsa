package ArrayMaths;// Java program to find
// out maximum subarray
// sum in linear time
// using prefix sum.

import java.util.Arrays;

class GFG
{
    // Function to compute maximum
    // subarray sum in linear time.
    static int maximumSumSubarray(int arr[], int n) {
        // Initialize minimum
        // prefix sum to 0.
        int min_prefix_sum = 0;

        // Initialize maximum subarray
        // sum so far to -infinity.
        int res = Integer.MIN_VALUE;

        // Initialize and compute
        // the prefix sum array.
        int prefix_sum[] = new int[n];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefix_sum[i] = prefix_sum[i - 1]
                    + arr[i];

        System.out.println(Arrays.toString(prefix_sum));
        // loop through the array, keep
        // track of minimum prefix sum so
        // far and maximum subarray sum.
        for (int i = 0; i < n; i++) { //-3 -1 3 2 5 1 4
            System.out.println("Previous res : "+res+" : min_prefix_sum "+ min_prefix_sum);
            System.out.println("prefix_sum[i]: "+prefix_sum[i]);
            res = Math.max(res, prefix_sum[i] -
                    min_prefix_sum);
            min_prefix_sum = Math.min(min_prefix_sum,
                    prefix_sum[i]);
            System.out.println("After res : "+res+" : min_prefix_sum "+ min_prefix_sum);
        }

        return res;
    }

    // Driver Program
    public static void main (String[] args) {
        // Test case 1
        int arr1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n1 = arr1.length;
        System.out.println(maximumSumSubarray(arr1, n1));

//        // Test case 2
//        int arr2[] = { -3, 2,4,-1, 3,-4,3 };
//        int n2 = arr2.length;
//        System.out.println(maximumSumSubarray(arr2, n2));
    }
}

// This code is contributed by Ansu Kumari.
