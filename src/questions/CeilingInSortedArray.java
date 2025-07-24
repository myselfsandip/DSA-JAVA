package questions;

//Smallest Element in array which is > ||  == target
public class CeilingInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(CeilingSortedAlgo(arr,15));
    }

    public static int CeilingSortedAlgo(int[] arr , int target){
        int start = 0 , end = arr.length - 1 ;
        int result = -1;
        while(start <= end){
            int mid = (start + end) / 2 ;

            if(target == arr[mid]){
                result =  arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1 ;
                result = arr[start];
            } else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return  result;
    }
}
