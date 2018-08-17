package guerbai.f401_450;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    private static int longestPalindrome(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i))+1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }
        int result = 0;
        boolean addOne = false;
        for (char c: m.keySet()) {
            if (m.get(c)%2==0) {
                result += m.get(c);
            } else {
                addOne = true;
                if (m.get(c) > 1) {
                    result += m.get(c) - 1;
                }
            }
        }
        if (addOne) result++;
        return result;
    }
}
