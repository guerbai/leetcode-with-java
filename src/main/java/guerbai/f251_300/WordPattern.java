package guerbai.f251_300;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    private static boolean wordPattern(String pattern, String str) {
        Map<Character, String> pm = new HashMap<>();
        String[] sl = str.split(" ");
        if (pattern.length() != sl.length) return false;
        for (int i=0; i<pattern.length(); i++) {
            if (pm.containsKey(pattern.charAt(i))) {
                if (!pm.get(pattern.charAt(i)).equals(sl[i])) {
                    return false;
                }
            } else {
                if (pm.containsValue(sl[i])) return false;
                pm.put(pattern.charAt(i), sl[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog dog dog dog";

    }
}
