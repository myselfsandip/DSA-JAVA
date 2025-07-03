package TwoDArray;

import java.util.*;

public class Matrics {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // First [] is Row And the Second [] is Column

        //Input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        search(matrix,5 );

        //Output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static boolean search(int[][] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == key){
                    System.out.println("FOUND THE KEY AT CELL: (" + i +"," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("KEY NOT FOUND");
        return false;
    }
}
