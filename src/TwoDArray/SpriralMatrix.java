package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpriralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int srow = 0 ;
        int scol = 0 ;
        int erow = m-1;
        int ecol = n-1;

        List<Integer> ans = new ArrayList<>();

        while(srow <= erow && scol <= ecol){
            //Top
            for(int i = scol ; i <= ecol ; i++){
                ans.add(matrix[srow][i]);
            }

            //Right
            for(int i = srow + 1 ; i <= erow ; i++){
                ans.add(matrix[i][ecol]);
            }

            //Bottom
            for(int i = ecol - 1 ; i>= scol ; i-- ){
                if(srow == erow){
                    break;
                }
                ans.add(matrix[erow][i]);
            }

            //Left
            for(int i = erow - 1 ; i>= srow+1 ; i-- ){
                if(scol == ecol){
                    break;
                }
                ans.add(matrix[i][scol]);
            }

            srow++;erow--;scol++;ecol--;

        }

        return ans;

    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int count = 1 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = count++;
            }

        }

        System.out.println("MATRIX:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("SPIRAL MATRIX: " + spiralOrder(arr));
    }



}
