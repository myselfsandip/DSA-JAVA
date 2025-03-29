package array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(2);

        list.add(55);
        list.add(67);
        list.add(85);
        list.add(25);
        list.add(66);
        list.add(55);
        list.add(55);
        list.add(55);
        list.add(55);
        list.add(55);
        list.add(55);

        System.out.println(list.size());

        list.set(0,22);
        list.remove(2);


        System.out.println(list);
    }
}
