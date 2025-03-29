import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        // Sum of n Natural Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of n natural numbers : " + sum);
    }
}
