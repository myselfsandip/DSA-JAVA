package strings;
//https://leetcode.com/problems/string-compression/description/
public class StringCompression {
    public static void main(String[] args) {

    }

    //Not Quite Optimal
    public static int compressString(char[] chars){
        Integer count = 0 ;
        int j = 0 ;
        for(int i=0 ; i < chars.length ; i++){
            count = 1 ;
            while(i < chars.length - 1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            chars[j++] = chars[i];

            if(count > 1){
                for(char c  : Integer.toString(count).toCharArray()){
                    chars[j++] = c ;
                }
            }
        }

        return j;
    }
}
