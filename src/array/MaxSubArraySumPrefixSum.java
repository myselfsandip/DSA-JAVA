package array;

public class MaxSubArraySumPrefixSum {
    public static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        printMaxSubArraySumPrefixSum(numbers);
    }

    public static void printMaxSubArraySumPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;

        // Calculate prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Finding max subarray sum
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                int currSum = (start == 0) ? prefix[end] : (prefix[end] - prefix[start - 1]);

                System.out.println("currSum: " + currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum is = " + maxSum);
    }


}
