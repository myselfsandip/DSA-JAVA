import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Answer: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Answer: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Answer: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Answer: " + (num1 / num2));
                break;
            case '%':
                System.out.println("Answer: " + (num1 % num2));
                break;
            default:
                break;
        }
    }
}
