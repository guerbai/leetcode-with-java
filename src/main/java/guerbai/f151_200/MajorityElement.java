package guerbai.f151_200;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (Integer num: nums) {
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num)+1);
            } else {
                counter.put(num, 1);
            }
        }
        for (Integer key: counter.keySet()) {
            if (counter.get(key) > nums.length/2) {
                return key;
            }
        }
        return 0;
    }
}
