package guerbai.f401_450;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {

    // window;
    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        if (s.length() == 0) return result;
        Map<Character, Integer> pm = new HashMap<>();
        Map<Character, Integer> sm = new HashMap<>();
        for (int i=0; i<p.length(); i++) {
            if (pm.containsKey(p.charAt(i))) {
                pm.put(p.charAt(i), pm.get(p.charAt(i))+1);
            } else {
                pm.put(p.charAt(i), 1);
            }
            if (sm.containsKey(s.charAt(i))) {
                sm.put(s.charAt(i), sm.get(s.charAt(i))+1);
            } else {
                sm.put(s.charAt(i), 1);
            }
        }
        for (int i=0; i<s.length()-p.length()+1; i++) {
            if (i != 0) {
                char c = s.charAt(i+p.length()-1);
                if (!sm.containsKey(c)) {
                    sm.put(c, 1);
                } else {
                    sm.put(c, sm.get(c)+1);
                }
            }
            if (sm.equals(pm)) {
                result.add(i);
            }
            char g = s.charAt(i);
            if (sm.get(g) == 1) {
                sm.remove(g);
            } else {
                sm.put(g, sm.get(g)-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s, p));
    }
}
