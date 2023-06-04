package Rough;

import java.util.Arrays;

public class Metl {
    public static void main(String[] args) {
        int[] arr = {36, 47, 90, 49, 98};
        System.out.println("Before: " + Arrays.toString(arr));
        int[] outArr = bubbleSort(arr);
        System.out.println("After: " + Arrays.toString(outArr));
         GFG.AlternateRearrange(outArr,5);
    }

    private static int[] bubbleSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j < input.length - i; j++) {
                if (input[j - 1] > input[j]) {
                    int holder = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = holder;
                }
            }
        }
        return input;
    }
}
