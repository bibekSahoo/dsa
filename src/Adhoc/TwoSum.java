package Adhoc;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> mapOfNumber = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapOfNumber.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            boolean keythere = mapOfNumber.containsKey((target - nums[j]));
            if (keythere && mapOfNumber.get(target - nums[j]) != j) {
                ans[0] = j;
                ans[1] = mapOfNumber.get(target - nums[j]);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String test = "qwerty";
        StringBuilder testbuild = new StringBuilder();
        testbuild.append("qwerty");
        System.out.println(test.equals(testbuild));
        System.out.println(test.substring(0,3).equals(testbuild.substring(0,3)));
        int[] input = new int[3];
        input[0] = 3;
        input[1] = 2;
        input[2] = 4;
        System.out.println(Arrays.toString(new TwoSum().twoSum(input, 6)));
    }

}
