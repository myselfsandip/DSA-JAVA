package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,16};
        int key = 8 ;

        int index = linearSearch(nums,key);

        if(index == -1){
            System.out.println("KEY NOT FOUND!!");
        }
        System.out.println("KEY is at Index : " + index);
    }

    public static int linearSearch(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }

        return -1;
    }

}

// Time Complexity - Big O of n