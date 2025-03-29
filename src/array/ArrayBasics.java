package array;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the Numbers: ");
//        for(int i= 0 ; i<arr.length ; i++){
//            arr[i] = in.nextInt();
//        }
//
//        for(int value : arr){
//            System.out.print(value + " ");
//        }

        String[] arr = new String[4];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Numbers: ");
        for(int i= 0 ; i<arr.length ; i++){
            arr[i] = in.next();
        }

        for(String value : arr){
            System.out.print(value + " ");
        }
    }
}

