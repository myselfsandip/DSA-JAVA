package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        System.out.println("Normal Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(arr)));
    }


    public static int[] reverseArray(int[] arr) {
        int first = 0, last = arr.length - 1 ;
        while (first < last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        return arr;
    }
}
