package BinarySearch;

public class BinarySearchFindMin {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{9,0,2,7,8}));
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        if(nums[left] <= nums[right]){
            return nums[left];
        }

        while ( left <= right){
            int mid = left + (right - left) / 2;


            int next = (mid + 1 ) % nums.length;
            int prev = (mid + nums.length - 1) % nums.length;
            if(nums[mid] < nums[prev] && nums[mid] < nums[next]){
                return nums[mid];
            }

            if(nums[left] < nums[mid]){
                if(nums[left] < nums[right]){
                    return nums[left];
                }
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
