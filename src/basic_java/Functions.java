import java.util.Scanner;
public class Functions {
    // Factorial
    public static int factorial(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }

    //Check Bionomial Coefficient of Numbers
    public static int BionomialCoefficient(int n,int r){
        int C = factorial(n)/(factorial(r) * (factorial(n-r)));
        return C;
    }

    //Check Prime Number
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        System.out.print("Prime Numbers : ");
        for(int i=2 ; i<=n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    //Binary to Decimel
    public static int binToDec(int n){
        int decimel = 0;
        for(int i = 0;n>0;i++){
            int LD = n % 10;
            decimel =  decimel + (LD * (int) Math.pow(2,i));
            n = n / 10;
        }
        return decimel;
    }
    //Decimel to Binary
    public static int decToBin(int n){
        int binary = 0;
        int pow = 0;
        while(n>0){
            int remainder = n % 2;
            binary = binary + remainder * ( (int) Math.pow(10,pow));
            n = n / 2;
            pow++;
        }
        return binary;
    }

    public static void main(String[] args) {
//        System.out.println(binToDec(10100011));
        int n = 13;
        System.out.println("Binary of " + n +" is : " + decToBin(n));
    }
}
