package guerbai.f751_800;

import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {

    private static int numJewelsInStones(String J, String S) {
        Set<Character> s = new HashSet<>();
        for (Character c: J.toCharArray()) {
            s.add(c);
        }
        int res = 0;
        for (Character c: S.toCharArray()) {
            if (s.contains(c)) {
                res++;
            }
        }
        return res;
    }

}