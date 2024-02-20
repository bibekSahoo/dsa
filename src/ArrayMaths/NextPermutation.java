package ArrayMaths;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // find from last a number smallet than the next number
        Boolean noMatch = Boolean.TRUE;

        for(int i = nums.length - 2; i >=0; i--){
            if(nums[i] < nums[i+1]){
                noMatch = Boolean.FALSE;
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        if(noMatch){
            reverseArray(nums);
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        new NextPermutation().nextPermutation(new int[]{1,2,3});
    }
}
