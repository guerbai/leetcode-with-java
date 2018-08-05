package guerbai.f1_50;

import java.util.*;

public class ThreeSum {

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            // 这里的处理超烦人.
            if (i!=0 && nums[i]==nums[i-1]) continue;
            int next = i+1;
            int last = nums.length-1;
            while (last-next>=1) {
                int sum = nums[i]+nums[next]+nums[last];
                if (sum>0) {
                    int v = nums[last];
                    while (last>i && nums[last-1]==v) {
                        last--;
                    }
                    last--;
                } else if (sum<0) {
                    int v = nums[next];
                    while (next<last && nums[next+1]==v) {
                        next++;
                    }
                    next++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[next], nums[last]));
                    int v = nums[last];
                    while (last>i && nums[last-1]==v) {
                        last--;
                    }
                    last--;
                    v = nums[next];
                    while (next<last && nums[next+1]==v) {
                        next++;
                    }
                    next++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] s = {-2, 0, 0, 2, 2};
        System.out.println(threeSum(s));
    }
}
