package strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a' ; ch <= 'z' ; ch++ ){
            sb.append(ch); // Append Element at the Rear
        }

        System.out.println(sb);
        System.out.println("LENGTH: "+ sb.length());

        //Time Complexity - O(26)
        //If its Normal String then - 0(26*n^2)
    }
}
