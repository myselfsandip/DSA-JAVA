package sorting_algorithms;

import java.util.Arrays;

public class DescSortAlgos {
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        System.out.println("UNSORTED ARRAY: " + Arrays.toString(arr));

        //Bubble Sort
        System.out.println("BUBBLE SORT: "+ Arrays.toString(BubbleSortAlgo(arr)));
        //Selection Sort
        System.out.println("SELECTION SORT: " + Arrays.toString(SelectionSortAlgo(arr)));
        //Insertion Sort
        System.out.println("INSERTION SORT: " + Arrays.toString(InsertionSortAlgo(arr)));
        //Counting SORT
        System.out.println("COUNTING SORT: " + Arrays.toString(CountSortAlgo(arr)));
    }

    public static int[] BubbleSortAlgo(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] SelectionSortAlgo(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }


            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static int[] InsertionSortAlgo(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1 ;

            while(prev >= 0 && arr[prev] < curr){
                arr[prev - 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        return arr;
    }


    public static int[] CountSortAlgo(int[] arr){
        int largest = Integer.MIN_VALUE;

        //Find the Max
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }

        int[] countArr = new int[largest + 1];

        //Store Elements Count in the Count Array
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        int index = 0 ;
        for (int i = countArr.length - 1; i >= 0; i--) {
            while (countArr[i] > 0){
                 arr[index] = i;
                 index++;
                 countArr[i]--;
            }
        }

        return arr;
    }
}
