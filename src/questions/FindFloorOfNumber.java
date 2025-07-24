package questions;

public class FindFloorOfNumber {
    public static void main(String[] args) {
            int[] arr = {2,3,5,9,14,16,18};
            System.out.println(findFloorOfNumAlgo(arr,15));
        }

        //Greatest Number that is smaller or equal to the target number
        public static int findFloorOfNumAlgo(int[] arr , int target){
            int start = 0 , end = arr.length - 1 ;
            int result = -1;
            while(start <= end){
                int mid = (start + end) / 2 ;

                if(target == arr[mid]){
                    result =  arr[mid];
                } else if (target > arr[mid]) {
                    start = mid + 1 ;
                } else if(target < arr[mid]){
                    end = mid - 1;
                    result = arr[end];
                }
            }
            return  result;
        }
}
