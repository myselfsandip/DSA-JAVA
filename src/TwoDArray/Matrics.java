package TwoDArray;

import java.util.Scanner;

public class Matrics {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // First [] is Row And the Second [] is Column


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("THE MATRIX IS: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
