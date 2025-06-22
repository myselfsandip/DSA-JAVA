package sorting_algorithms;

import java.util.Arrays;
import java.util.Collections;

public class InbuildSort {
    public static void main(String[] args) {
        Integer[] arr = {4,5,1,2,3};
        //Basic Sorting
        Arrays.sort(arr);
        //Collections.reverseOrder() only Works with Objects , that's why we have to use "Integer[] arr" instead of "int[] arr"
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
