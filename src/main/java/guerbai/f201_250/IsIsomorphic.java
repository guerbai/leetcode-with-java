package guerbai.f201_250;

import java.util.*;

public class IsIsomorphic {

    private static boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> maps = new HashMap<>();
        Map<Character, List<Integer>> mapt = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (maps.get(s.charAt(i)) == null) {
                maps.put(s.charAt(i), new ArrayList<Integer>());
            }
            if (mapt.get(t.charAt(i)) == null) {
                mapt.put(t.charAt(i), new ArrayList<Integer>());
            }
            maps.get(s.charAt(i)).add(i);
            mapt.get(t.charAt(i)).add(i);
            if (!maps.get(s.charAt(i)).equals(mapt.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    private static boolean cleverWay(String s, String t) {
        Map<Character, Character> maps = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (maps.containsKey(a)) {
                if (!maps.get(a).equals(b)) {
                    return false;
                }
            } else {
                // 这个判断很关键，说明b之前出现过，已有其他a跟他对应了，而此时又有了新的a，
                if (maps.containsValue(b)) {
                    return false;
                }
                maps.put(a, b);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aa";
        String t = "ab";
        System.out.println(cleverWay(s, t));
        System.out.println(cleverWay(t, s));
    }
}
