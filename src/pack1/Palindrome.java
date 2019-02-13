package pack1;

import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("ABCDEDCBA"));
        System.out.println(isPalindrome("nadeem"));
        System.out.println(isPalindrome("XYZQYX"));
        System.out.println(isPalindrome("bob"));
        System.out.println(isPalindrome("123"));
        System.out.println(isPalindrome("1"));
    }

    public static boolean isPalindrome(String str){

        boolean result = false;
        int length = str.length();
        char[] charArray = str.toCharArray();
        if(length % 2 != 1){
            return false;
        }

        ArrayList<String> firstArr = new ArrayList<>();

        String firstStr = "";
        for(int i = 0; i < (length/2); i++){
            firstStr = firstStr + String.valueOf(charArray[i]);
        }

        String secondStr = "";
        for(int i = length - 1; i > (length / 2) ; i-- ){
            secondStr = secondStr + String.valueOf(charArray[i]);
        }

        if(firstStr.equals("") || secondStr.equals("")){
            result = false;
        }

        if(firstStr.equals(secondStr)){
            result = true;
        }
        return result;

    }
}
