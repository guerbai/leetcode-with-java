package guerbai.f851_900;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumSpecialEquivGroups {

    public int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet<>();
        for (String a: A) {
            int[] asit = new int[52];
            for (int i=0; i<a.length(); i++) {
                if (i % 2 == 0) {
                    asit[a.charAt(i)-'a']++;
                } else {
                    asit[a.charAt(i)-'a'+26]++;
                }
            }
            seen.add(Arrays.toString(asit));
        }
        return seen.size();  
    }

}