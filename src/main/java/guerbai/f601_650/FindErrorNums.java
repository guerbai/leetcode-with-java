package guerbai.f601_650;

import java.util.HashMap;
import java.util.Map;

public class FindErrorNums {

    private static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for (int num: nums) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        for (int i=0; i<nums.length; i++) {
            if (m.get(nums[i]) == 2) {
                res[0] = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (m.get(i+1) == null) {
                res[1] = i + 1;
            }
        }
        return res;
    }

    // solution. https://leetcode.com/problems/set-mismatch/
    private static int[] findErrorNumsClever(int[] nums) {
        int dup = -1;
        int missing = 1;
        for (int n: nums) {
            if (nums[Math.abs(n)-1] > 0) {
                nums[Math.abs(n)-1] *= -1;
            } else {
                dup = Math.abs(n);
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
            }
        }
        return new int[]{dup, missing};
    }

}