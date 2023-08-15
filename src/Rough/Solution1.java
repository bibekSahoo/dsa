package Rough;

import java.util.Arrays;
import java.util.List;

public class Solution1 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        int minNum = 0;
        for(int i = 0 ; i < A.size(); i++){
            minNum = A.get(i);
            int minIndx = i;
            for(int j =i+1; j < A.size(); j++){
                if(A.get(j) < minNum){
                    minIndx = j;
                    int temp = A.get(j);
                    A.set(i, A.get(j));//set i
                    A.set(j, minNum);//set j
                    minNum = temp;
                }
            }
        }
        System.out.println(Arrays.toString(A.toArray()));
        return A.get(B-1);
    }


    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92);
        System.out.println(new Solution1().kthsmallest(A, 9));
    }
}
