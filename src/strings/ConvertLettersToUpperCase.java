package strings;

public class ConvertLettersToUpperCase {
    public static void main(String[] args) {
        String str = "hi, i am shradha" ;
        System.out.println(toUpperCase(str));;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

         sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i - 1) == ' ' && i < str.length() - 1){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
