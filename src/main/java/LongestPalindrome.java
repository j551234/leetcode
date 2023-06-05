import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        Integer palindromeCount=0;
        for(int i = 0 ; i < s.length();i++){
            Character indexChar = s.charAt(i);
            if (characterIntegerMap.containsKey(indexChar)){
               Integer charCount =  characterIntegerMap.get(indexChar) +1;
               characterIntegerMap.put(indexChar,charCount);
               if(charCount%2==0){
                   palindromeCount= palindromeCount+1;
               }
            }
            else {

                characterIntegerMap.put(indexChar,1);
            }
        }
        if(palindromeCount*2<s.length()){
            palindromeCount = palindromeCount*2+1;
        }
        else {
            palindromeCount = palindromeCount*2;
        }
        return  palindromeCount;
    }

    public static void main(String[] args) {
        String  s = "abccccdd";
        longestPalindrome(s);
    }
}
