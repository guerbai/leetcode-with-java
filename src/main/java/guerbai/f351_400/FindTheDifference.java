package guerbai.f351_400;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    private static char findTheDifference(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }
        for (int i=0; i<t.length(); i++) {
            if (!m.containsKey(s.charAt(i))) {
                return s.charAt(i);
            }
            if (m.containsKey(s.charAt(i)) && m.get(s.charAt(i)) == 1) {
                m.remove(s.charAt(i));
            } else {
                m.put(s.charAt(i), m.get(s.charAt(i)) - 1);
            }
        }
        return '&';
    }

    // 应该用位操作的一道经典题目。
    private static char bitManipulation(String s, String t) {
        int mask = 0;
        for (int i=0; i<s.length(); i++) {
            mask ^= s.charAt(i);
        }
        for (int i=0; i<t.length(); i++) {
            mask ^= t.charAt(i);
        }
        return (char) mask;
    }

}
