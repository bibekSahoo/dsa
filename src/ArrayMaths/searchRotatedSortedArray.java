package ArrayMaths;

public class searchRotatedSortedArray {
    public int search(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//        if(nums.length == 1 && target == nums[start]){
//            return start;
//        } else if (nums.length == 2) {
//            if(target == nums[start]){
//                return start;
//            } else if (target == nums[end]) {
//                return end;
//            }
//        }
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            int next = (mid + 1) % nums.length;
//            int prev = (mid + nums.length - 1) % nums.length;
//            if (nums[mid] < next && nums[mid] < prev && nums[mid] == target) {
//                return mid;
//            }
//            if (nums[mid] > nums[end]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        if(start == end && nums[start] == target){
//            return start;
//        }
//        return -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] input = {4,5,6,7,0,1,2};
        System.out.println(new searchRotatedSortedArray().search(input, 1));
    }
}
