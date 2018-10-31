package guerbai.f851_900;

import java.util.*;

public class BuddyStrings {

    private static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        List<Character> la = new ArrayList<>();
        List<Character> lb = new ArrayList<>();
        Map<Character, Integer> ma = new HashMap<>();
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (la.size() == 2) {
                    return false;
                }
                la.add(A.charAt(i));
                lb.add(B.charAt(i));
            }
            ma.put(A.charAt(i), ma.getOrDefault(A.charAt(i), 0)+1);
        }
        if (la.size() == 0) {
            for (int v: ma.values()) {
                if (v % 2 == 0 && v > 0) {
                    return true;
                }
            }
            return false;
        }
        if (la.size() == 1) return false;
        return la.get(0) == lb.get(1) && la.get(1) == lb.get(0);
    }

}