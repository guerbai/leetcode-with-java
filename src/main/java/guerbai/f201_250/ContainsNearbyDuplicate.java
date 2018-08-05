package guerbai.f201_250;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if (m.containsKey(nums[i]) ) {
                if (Math.abs(i - m.get(nums[i])) <= k) {
                    return true;
                }
                m.put(nums[i], i);
            }
            if (!m.containsKey(nums[i])) {
                m.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
