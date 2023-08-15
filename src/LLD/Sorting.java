package LLD;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] inputs = {7, 3, 5, 2, 1, 8, 9};
//        selectionSort(inputs);
//        bubbleSort(inputs);
        insertionSort(inputs);
    }

    private static void insertionSort(int[] arr) {
        System.out.println("############# Insertion SORT! #################");
        for (int i = 0; i < arr.length - 1; i++) { //iteration normal
            for (int j = i+1; j > 0; j--) { // from that element
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        System.out.println("############# SELECTION SORT! #################");
        for (int i = 0; i < arr.length - 1; i++) { //iteration normal
            int minNumber = arr[i], minindex = i;
            for (int j = i+1; j < arr.length ; j++) { // find minimum in the remaining element
                if (arr[j] < minNumber) {
                    minNumber = arr[j];
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = minNumber;
            arr[minindex] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] inputs) {
        System.out.println("############# Bubble SORT! #################");
        for (int i = 1; i < inputs.length - 1; i++) { //iteration from 1 to n-1
            for (int j = 0; j < inputs.length - i; j++) { // check j , j+1
                if (inputs[j] > inputs[j + 1]) {
                    int temp = inputs[j + 1];
                    inputs[j + 1] = inputs[j];
                    inputs[j] = temp;
                }

                System.out.println(Arrays.toString(inputs));
            }
        }
        System.out.println(Arrays.toString(inputs));
    }
}
