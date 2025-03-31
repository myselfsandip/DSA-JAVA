package array;

public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {1,25,32,75,62,14,32,5};

        System.out.println("Largest is : " + getLargest(arr));
    }

    public static int getLargest(int[] arr){
        int largest = Integer.MIN_VALUE; // Get the -infinity (means the smallest number that exists)
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int getSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest >  arr[i]){
                smallest = arr[i];
            }
        }

        return smallest;
    }
}
