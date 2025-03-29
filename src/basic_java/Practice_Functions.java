public class Practice_Functions {
//    Question 1 :Write a Java method to compute the averageof three numbers.
    public static void avgOfThreeNumbers(float num1,float num2,float num3,float num4){
        float result =  (num1 + num2 + num3 +num4) / 4;
        String formatted_result = String.format("%.2f", result);
        System.out.println("Answer: " + formatted_result);
    }

    //Check Palindrome or Not
    public static void isPalindrome(int n){
        int dup_n = n;
        int reverseNum = 0;
        while (n>0){
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n = n/10;
        }
        if(dup_n ==  reverseNum ){
            System.out.println(dup_n + " is a Palindrome Number");
        }
        else {
            System.out.println(dup_n + " is not a Palindrome Number");
        }
    }

    //Sum of Digits
    public static void sumOfDigits(int n){
        int sum = 0;
        int dup_n = n;
        while(n > 0){
            int LD = n % 10;
            sum = sum + LD ;
            n = n/10;
        }
        System.out.println("Sum of " + dup_n + " is " + sum);
    }


    public static void main(String[] args) {
//        avgOfThreeNumbers(7.8f,6.6f,8.38f,7.92f);
//        avgOfThreeNumbers(7.5f,6.9f,8.38f,8.46f);
//        isPalindrome(282);
        sumOfDigits(540);
    }
}
