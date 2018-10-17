package guerbai.f851_900;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {
    
    private static boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(5, 0);
        m.put(10, 0);
        for (int bill: bills) {
            if (bill == 5) {
                m.put(5, m.get(5)+1);
            } else if (bill == 10) {
                if (m.get(5) == 0) {
                    return false;
                }
                m.put(5, m.get(5)-1);
                m.put(10, m.get(10)+1);
            } else {
                if (m.get(10) > 0) {
                    if (m.get(5) == 0) {
                        return false;
                    }
                    m.put(10, m.get(10)-1);
                    m.put(5, m.get(5)-1);
                } else if (m.get(5) < 3) {
                    return false;
                } else {
                    m.put(5, m.get(5)-3);
                }
            }
        }
        return true;
    }
}