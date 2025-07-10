package TwoDArray;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {10,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };

        stairCaseSearch(matrix,35);
        stairCaseSearchApproach2(matrix,35);
    }


    //Approach 1
    public static boolean stairCaseSearch(int[][] matrix , int key){
        int row  = 0 , col = matrix[0].length - 1 ;

        while (row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                row++;

            } else if (key < matrix[row][col]) {
                col--;
            }
        }
        System.out.println("Key Not Found!!");
        return false;
    }

    //Approach 2
    public static boolean stairCaseSearchApproach2(int[][] matrix, int key){
        int row = matrix.length - 1 , col = 0;

        while(row >= 0 && col < matrix.length){
            if(matrix[row][col] == key){
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                col++;
            } else if (key < matrix[row][col]) {
                row--;
            }
        }
        System.out.println("Key Not Found!!");
        return false;
    }


    
}
