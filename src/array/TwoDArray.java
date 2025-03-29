package array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int row=0; row < arr.length; row++){
              for (int col=0; col<arr[row].length;col++){
                  System.out.println(col == 0 ? "Enter First Column Element (Row Start): " : "Enter Column Element: ") ;
                  arr[row][col] = takeInput.nextInt();
              }
        }

        for (int row=0; row < arr.length; row++){
            for (int col=0; col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
