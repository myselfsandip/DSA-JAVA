package array;

public class MaxSubarraySumKadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        int SubArrayMaxSum = KadanesAlgoForAllAllcases(arr);

        System.out.println("THE MAX SUM IS : " + SubArrayMaxSum);

        int[] arrNegative = {-1,-2,-3,-4};

        int SubArrayMaxSumNegative = KadanesAlgoForAllNegative(arrNegative);

        System.out.println("THE MAX SUM OF THE NEGATIVE ARRAY IS  : " + SubArrayMaxSumNegative);
    }

    //This is not for the case where all the elements are negative
    public static int KadanesAlgo(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0 ; i < numbers.length ; i++){
            currentSum += numbers[i];
            if(currentSum < 0) currentSum = 0 ;
            maxSum = Math.max(currentSum,maxSum);

        }

        return maxSum;
    }

    public static int KadanesAlgoForAllNegative(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0 ; i < numbers.length ; i++){
            currentSum += numbers[i];
            maxSum = Math.max(currentSum,maxSum);

        }
        return maxSum;

    }

    // Always Use this in Interview || The 0 Checking is not needed , it only works if the  Elements are positive
    public static int KadanesAlgoForAllAllcases(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0 ; i < numbers.length ; i++){
            // if the currentSum is Negative and then a no like 2 appears then the subtration will not save instead the positive 2 will be the new CurrentSum
            currentSum = Math.max(numbers[i],currentSum + numbers[i]);

            maxSum = Math.max(currentSum,maxSum);

        }
        return maxSum;

    }
}
