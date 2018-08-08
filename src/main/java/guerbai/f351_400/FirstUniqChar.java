package guerbai.f351_400;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqChar {

    private static int firstUniqChar(String s) {
        Map<Character, List<Integer>> m = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.get(s.charAt(i)).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                m.put(s.charAt(i), indexList);
            }
        }
        int min = Integer.MAX_VALUE;
        for (char c: m.keySet()) {
            if (m.get(c).size() == 1 && m.get(c).get(0) < min) {
                min = m.get(c).get(0);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
