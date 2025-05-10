package array;

public class MaxSubArraySumPrefixSum {
    public static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        printMaxSubArraySumPrefixSum(numbers);
    }

    public static void printMaxSubArraySumPrefixSum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0 ;

        //Generate Prefix Sum Array
        int[] prefixArray = new int[numbers.length];
        prefixArray[0] = numbers[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = numbers[i] + prefixArray[i-1];
        }


        //Generate Max Subarray Prefix Sum
        for(int start = 0; start< numbers.length ; start++){
            for (int end = start ; end< numbers.length ; end++){
                currentSum = start == 0 ? prefixArray[end] :  prefixArray[end] - prefixArray[start - 1];

                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("THE MAX SUM IS : " + maxSum);



    }
}
