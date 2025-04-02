package array;

public class MaxSubArraySumBruteForce {
    public static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        printMaxSubArraySum(numbers);
    }

    public static void printMaxSubArraySum(int[] arr){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.println("currSum : " + currSum);
                if (maxSum < currSum){
                    maxSum = currSum ;
                }
                currSum = 0 ;
                count++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("MAX SUBARRAY SUM IS : " + maxSum);
        System.out.println("Total Subarray are : " + count);
    }

    //Time Complexity : When there is 3 Nested Loops which goes to n , then the Time Complexity will be - O(n³)
}
