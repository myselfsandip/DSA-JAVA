package questions;

import java.util.Arrays;

//https://leetcode.com/problems/find-missing-and-repeated-values/description/
public class RepeatMissingNumber {
    public static void main(String[] args) {
        int[][] grid = {
                {1,3},
                {2,2}
        };

        // Expected Output - [2,4]

        System.out.println(Arrays.toString(repeatMissingNumberFunc(grid)));
    }
    public static int[] repeatMissingNumberFunc(int[][] grid){
        int[] result = new int[2];
        int[] tracker = new int[grid.length * grid.length + 1];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int val = grid[i][j];
                tracker[val]++;
            }
            
        }

        for (int i = 1; i < tracker.length; i++) {
            if(tracker[i] > 1){
                result[0] = i;
            } else if (tracker[i] < 1) {
                result[1] = i ;
            }
        }

        return result;
    }
}
