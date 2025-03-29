import java.util.Scanner;

//Given the number of the month, your task is to calculate the number of days present in the particular month.
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Month Number : ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("February has 28 days");
        } else if (n < 8) {
            if (n % 2 == 0) {
                System.out.println("This month has 30 Days");
            } else {
                System.out.println("This month has 31 Days");
            }
        } else if (n <= 8) {
            if (n % 2 == 0) {
                System.out.println("This month has 31 Days");
            } else {
                System.out.println("This month has 30 Days");
            }
        }
    }
}
