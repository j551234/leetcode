import java.util.Arrays;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        // use sort to alphabet comparing  ,so just need to check the last one longest alphabet
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);

    }

}
