package sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};

        System.out.println("Sorted Array: " + Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0 ; i< n-1 ; i++){
            for(int j = 0 ; j< n - 1 - i ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j] ;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
