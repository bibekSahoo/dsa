package Adhoc;

import java.util.ArrayList;
import java.util.Arrays;

public class TowerBrahma {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        hanoi(A,1,2,3);
        return arr;
    }

    public void hanoi(int a, int start, int helper, int destination){
        if(a == 0){
            return;
        }
        hanoi(a-1, start, destination, helper);
        arr.add(new ArrayList<Integer>(Arrays.asList(a, start, destination)));
        hanoi(a-1, helper, start, destination);
    }

    public static void main(String[] args) {
        new TowerBrahma().towerOfHanoi(2);
        for (ArrayList<Integer> each: arr) {
            System.out.println(each);
        }
    }
}
