import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n == 2)
            System.out.println(n + " is a Prime Number");

        // Prime Number Basic Method
        // for (int i = 2; i < n - 1; i++) {
        // if (n % i == 0) {
        // System.out.println(n + " is not a Prime Number");
        // return;
        // }
        // }

        // Prime Number Optimized Approach
        for (int i = 2; i < Math.sqrt(n); i++) { // Square Root of n
            if (n % i == 0) {
                System.out.println(n + " is not a Prime Number");
                return;
            }
        }
        System.out.println(n + " is a Prime Number");

    }
}
