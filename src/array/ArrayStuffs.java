package array;

public class ArrayStuffs {
    //Print Subarrays
    public static void subArray(int arr[]){
        for(int i=0 ; i< arr.length;i++){
            for(int j = i ; j<arr.length ; j++){
                for(int k= i ; k<= j ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    //Max sub-array Sum
    public static int subArraySum(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i < arr.length ; i++ ){
            for (int j = i ; j < arr.length ; j++){
                int currSum = 0;
                for(int k=i ; k<=j ; k++){
                    System.out.print(arr[k] + " ");
                    currSum = currSum + arr[k];
                    if(maxSum<currSum){
                        maxSum = currSum;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
//        int arr[] = {1,-2,6,-1,3};
        System.out.println("Max Sum : " + subArraySum(arr));
    }
}
