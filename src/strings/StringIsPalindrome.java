package strings;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String str = "racecare";
        String str2 = "A man, a plan, a canal: Panama";
        isAPalindrom(str2);
    }

    public static boolean isAPalindrom(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start < end){

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                System.out.println(s + " is not a Palindrome");
                return false;
            }
            start++;
            end--;
        }
        System.out.println(s + " is a Palindrome");
        return true;
    }

    //Approach 2 - Only Works  if the string is preprocessed (non-alphanumerics removed, lowercased).
    public static boolean isAPalindromApproach2(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n - i - 1)){
                System.out.println(str + " is not a Palindrome");
                return false;
            }
        }
        System.out.println(str + " is a Palindrome");
        return true;
    }
}




