package sorting_algorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        System.out.println("UNSORTED ARRAY: " + Arrays.toString(arr));
        countingSortAlgo(arr);
    }

    public static void countingSortAlgo(int[] arr){
        if(arr == null || arr.length <= 1){
            return ;
        }
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }

        int[] countArray = new int[largest+1];

        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        int index = 0 ;
        for (int i = 0; i < countArray.length; i++) {
            while(countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }

        System.out.println("SORTED ARRAY: "+ Arrays.toString(arr));


    }
}
