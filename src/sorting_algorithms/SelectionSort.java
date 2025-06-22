package sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        System.out.println("Sorted Array: " + Arrays.toString(selectionSortAlgo(arr)));
    }

    public static int[] selectionSortAlgo(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
