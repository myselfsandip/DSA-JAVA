package strings;

import java.util.Scanner;

public class BasicsStrings {
    public static void main(String[] args) {
        String atr = "abcd";
        String str = new String("xyz");

        //Strings are Immutable

//        Scanner sc = new Scanner(System.in);
        //String name = sc.next(); //This next only takes one word , if two words are entered like hi bro then it wiell only take hi
//        String name =  sc.nextLine();  //This takes entire line

        //System.out.println("Name is: " + name);

        String fullName = "Tony Stark";
//        System.out.println(fullName.length());
        printLetters(fullName);

    }

    public static void printLetters(String str){
        for (int i = 0 ; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}
