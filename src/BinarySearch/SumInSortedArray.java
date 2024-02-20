package BinarySearch;

public class SumInSortedArray {

    /*Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
Output: true*/

    public static void main(String[] args) {
        int[] input = new int[]{11, 15, 6, 8, 9, 10};
        System.out.println(solution(input, 160));
    }

    private static Boolean solution(int[] input, int sum) {
        int left = 0;
        int right = input.length - 1;
        int smallestNumberLocation = -1;
        while (left < right) { // note down
            int mid = left + (right - left) / 2;

            if (input[mid] < input[left] && input[mid] < input[right]) {
                smallestNumberLocation = mid;
                break;
            }

            if (input[mid] > input[right]) {
                left = mid + 1;
            } else {
                right = mid; // note down
            }
        }
        int front = smallestNumberLocation;// mistake
        int back = (front + input.length - 1) % input.length;
        while (front != back) { // note down
            if (input[front] + input[back] == sum) {
                return Boolean.TRUE;
            }

            if (input[front] + input[back] > sum) {
                back = (back + input.length - 1) % input.length;
            } else {
                front = (front + 1) % input.length;
            }
        }
        return Boolean.FALSE;
    }
}
