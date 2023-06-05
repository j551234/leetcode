import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
       // just use for check exist method
        // int the array value should be zero
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            //first time if not get value should be zero
            // if use than should return the index for below update
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
