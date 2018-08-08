package guerbai.f351_400;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0; i<ransomNote.length(); i++) {
            if (m.containsKey(ransomNote.charAt(i))) {
                m.put(ransomNote.charAt(i), m.get(ransomNote.charAt(i))+1);
            } else {
                m.put(ransomNote.charAt(i), 1);
            }
        }
        for (int i=0; i<magazine.length(); i++) {
            if (m.containsKey(magazine.charAt(i))) {
                if (m.get(magazine.charAt(i)) == 1) {
                    m.remove(magazine.charAt(i));
                } else {
                    m.put(magazine.charAt(i), m.get(magazine.charAt(i))-1);
                }
            }
        }
        return m.size() == 0;
    }
}
