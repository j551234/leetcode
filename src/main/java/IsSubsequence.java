public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        // user t  to march s

        for (int i = 0, j = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                // if match use another t element
                j++;
            }
            if (j == s.length()) {
                // if match all s element
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
