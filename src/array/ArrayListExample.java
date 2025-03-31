package array;

public class ArrayListExample {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(2);

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

        System.out.println(list.size()); // Output the size of the list

        list.set(0, 22); // Set first element to 22
        list.remove(2);  // Remove the element at index 2

    }
}
