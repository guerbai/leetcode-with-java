package guerbai.f551_600;

import java.util.*;

public class FindRestaurant {

    private static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> minRes = new ArrayList<>();
        Map<String, int[]> m = new HashMap<>();
        for (int i=0; i<list1.length; i++) {
            m.put(list1[i], new int[]{i, -1});
        }
        for (int i=0; i<list2.length; i++) {
            if (m.get(list2[i]) != null) {
                m.get(list2[i])[1] = i;
            }
        }
        int mi = Integer.MAX_VALUE;
        for (String s: m.keySet()) {
            int i1 = m.get(s)[0];
            int i2 = m.get(s)[1];
            if (i2 == -1) {
                continue;
            }
            if (i1 + i2 < mi) {
                mi = i1 + i2;
            }
        }
        for (String s: m.keySet()) {
            int i1 = m.get(s)[0];
            int i2 = m.get(s)[1];
            if (i1 + i2 == mi && i2 != -1) {
                minRes.add(s);
            }
        }
        String[] result = new String[minRes.size()];
        for (int i=0; i<result.length; i++) {
            result[i] = minRes.get(i);
        }
        return result;
    }

}
