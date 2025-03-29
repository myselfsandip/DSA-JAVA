import java.util.Scanner;

public class PracticeQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of Pencil: ");
        int item1 = sc.nextInt();
        System.out.print("Enter the price of Pen: ");
        int item2 = sc.nextInt();
        System.out.print("Enter the price of Eraser: ");
        int item3 = sc.nextInt();
        int sum = item1 + item2 + item3;
        System.out.println("Total Cost Without Tax: " + sum);
        int gst = (int) (sum * 0.18);  // here without () the expression will give error because firstly (int) is converting sum to int and after that the sum * 0.18 happens and then the answer becomes a double and double can't store in int . 
        System.out.println("18% GST: " + gst);
        
        // Casting the sum_with_tax to int
        int sum_with_tax = (int)(sum + gst);
        
        System.out.println("Total Cost With Tax (as int): " + sum_with_tax);
    }
}
