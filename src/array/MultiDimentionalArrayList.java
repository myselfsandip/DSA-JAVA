package array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimentionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // First You have to initialize the row number otherwise in the time of insertion the row num will be null and that will give error
        for (int i = 0 ; i<3 ; i++){
            list.add(new ArrayList<>());   // Adding 3 Array List inside of Arraylist
        }

        //add element
        for (int row = 0 ; row < 3 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                list.get(row).add(in.nextInt());
            }
        }

        System.out.println(list);
    } 
}
