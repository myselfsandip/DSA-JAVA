package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter Elements: ");
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Array : " + Arrays.toString(arr));

        System.out.println("---------------------------------------");
        System.out.print("Enter Key for Binary Search: ");
        int key = input.nextInt();

        int resultIdx = binarySearch(arr,key);

        if (resultIdx == -1){
            System.out.println("Key not found in the Array");
        }else {
            System.out.println("The Key is at Index " + resultIdx);
        }
    }

    public static int binarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1 ;
        while (start <= end){
            int mid = (start + end) / 2 ;
            if (arr[mid] == key){
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1 ;
            }
        }

        return  -1 ;
    }

//    Output
//    Enter Elements:
//            10
//            2
//            30
//            40
//            50
//    Array : [10, 2, 30, 40, 50]
//            ---------------------------------------
//    Enter Key for Binary Search: 40
//    The Key is at Index 3

}
