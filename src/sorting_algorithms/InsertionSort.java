package sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};

        System.out.println("UNSORTED ARRAY : " + Arrays.toString(arr));
        System.out.println("SORTED ARRAY: " + Arrays.toString(insertionSortAlgo(arr)));
    }

    public static int[] insertionSortAlgo(int[] arr){
        for (int i=1; i< arr.length ; i++){
            int curr = arr[i] ;
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;
    }
}
