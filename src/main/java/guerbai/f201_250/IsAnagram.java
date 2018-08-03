package guerbai.f201_250;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    private static boolean isAnagram(String s, String t) {
        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> tm = new HashMap<>();
        for (int i=0; i < s.length(); i++) {
            if (sm.containsKey(s.charAt(i))) {
                sm.put(s.charAt(i), sm.get(s.charAt(i))+1);
            } else {
                sm.put(s.charAt(i), 1);
            }
        }
        for (int i=0; i < t.length(); i++) {
            if (tm.containsKey(t.charAt(i))) {
                tm.put(t.charAt(i), tm.get(t.charAt(i))+1);
            } else {
                tm.put(t.charAt(i), 1);
            }
        }
        return sm.equals(tm);
    }
}
