package TwoDArray;

import java.util.Arrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("Result: " + diagonalSum(matrix));

    }

    public static int diagonalSum(int[][] mat){
        int sum = 0 ;

        //Brute Force
         /*for(int i = 0 ; i< mat.length; i++){
            for(int j = 0; j < mat[0].length ; j++){
                if(i == j){
                    sum += mat[i][j];
                }else if(i + j == mat.length - 1){
                    sum += mat[i][j];
                }
            }
        }*/



        //Optimized
        for (int i = 0; i < mat.length; i++) {
            //PD
            sum += mat[i][i];

            //SD
            int j = mat.length - i - 1;
            if(i != j) {
                sum += mat[i][j];
            }

        }

        return sum;
    }
}
