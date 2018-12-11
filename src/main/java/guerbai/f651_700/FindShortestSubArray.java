package guerbai.f651_700;

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {

    private static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer[]> mi = new HashMap<>();
        Map<Integer, Integer> mc = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            mc.put(nums[i], mc.getOrDefault(nums[i], 0)+1);
            if (!mi.containsKey(nums[i])) {
                Integer[] index = new Integer[2];
                index[0] = i;
                index[1] = i;
                mi.put(nums[i], index);
            } else {
                Integer[] index = mi.get(nums[i]);
                index[1] = i;
                mi.put(nums[i], index);
            }
        }
        int degree = 0;
        int minL = Integer.MAX_VALUE;
        for (int m: mc.keySet()) {
            if (mc.get(m) == degree) {
                int leng = mi.get(m)[1] - mi.get(m)[0] + 1;
                if (leng < minL) {
                    minL = leng;
                }
            } else if (mc.get(m) > degree) {
                degree = mc.get(m);
                minL = mi.get(m)[1] - mi.get(m)[0] + 1;
            }
        }
        return minL;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
}
