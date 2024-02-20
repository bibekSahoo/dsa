package ArrayMaths;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Permutations:");
        generatePermutations(arr, 0, arr.length - 1);
    }

    public static void generatePermutations(Integer[] arr, int start, int end) {
        if (start == end) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = start; i <= end; i++) {
                // Swap elements at positions start and i
                swap(arr, start, i);

                // Recursively generate permutations for the remaining elements
                generatePermutations(arr, start + 1, end);

                // Backtrack by swapping elements back to their original positions
                swap(arr, start, i);
            }
        }
    }

    public static void swap(Integer[] arr, int i, int j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
