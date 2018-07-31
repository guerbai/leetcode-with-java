package guerbai.twofiveone_to_threezerozero;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MissingNumber {

    // hashmap
    private static int missingNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num: nums) s.add(num);
        for (int i=0; i <= nums.length; i++) {
            if (!s.contains(i)) return i;
        }
        return -1;
    }

    // 加和, n*(n+1)/2;
    private static int gaussMethod(int[] nums) {
        int sum = 0;
        for (int num: nums) sum += num;
        int expectSum = (0 + nums.length) * (nums.length + 1) / 2;
        return expectSum - sum;
    }

    // https://leetcode.com/problems/missing-number/solution/
    private static int bitMethod(int[] nums) {
        int mask = nums.length;
        for (int i=0; i < nums.length; i++) {
            mask = mask ^ nums[i] ^ i;
        }
        return mask;
    }
}
