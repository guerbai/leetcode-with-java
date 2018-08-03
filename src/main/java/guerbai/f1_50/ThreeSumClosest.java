package guerbai.f1_50;

import java.util.Arrays;

public class ThreeSumClosest {

    private static int threeSumClosest(int[] nums, int target) {
        assert nums.length > 2;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[nums.length-1];
        int closestAbs = Math.abs(closestSum-target);
        for (int i=0; i<nums.length-2; i++) {
            int next = i+1;
            int last = nums.length-1;
            while (last-next>=1) {
                int sum = nums[i] + nums[next] + nums[last];
                int abs = Math.abs(sum-target);
                if (abs<closestAbs) {
                    closestAbs = abs;
                    closestSum = sum;
                }
                if (sum>target) {
                    last--;
                } else {
                    next++;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] s = {0, 2, 1, -3};
        threeSumClosest(s, 1);
    }
}
