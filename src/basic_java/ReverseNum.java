import java.util.Scanner;

class ReverseNum {
    public static void main(String[] args) {
        // Reverse of Number n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        System.out.println("Your Number is : " + n);
        int reverseNum;
        while (n > 0) {
            reverseNum = n % 10;
            System.out.print(reverseNum);
            n /= 10;
        }
    }
}