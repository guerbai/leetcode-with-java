package guerbai.f201_250;

import java.util.Arrays;

public class RobCircle213 {

//        超时recursion解法，寻找与正确解法之间的差距；超时解法用了过多的copyOfRange，把线性变成了O(n2)，这是关键点;
//        if (nums.length == 0) return 0;
//        if (nums.length == 1) return nums[0];
//        if (nums.length == 2) return Math.max(nums[0], nums[1]);
//        return Math.max(recursion(Arrays.copyOfRange(nums, 0, nums.length-2)) + nums[nums.length-1],
//                recursion(Arrays.copyOfRange(nums, 0, nums.length-1)));

    private static int recursion(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int lastPassMaxAmount = 0;
        int maxAmount = 0;
        for (int i=0; i<nums.length; i++) {
            // 现在这家，要么抢，要么不抢，分别算出两种情况的最大值.
            int thisRobMaxAmount = lastPassMaxAmount + nums[i];
            // maxAmount意味着有可能使用之前的最后一位，是不安全的，之后要使用它必须隔一位；
            lastPassMaxAmount = maxAmount;
            maxAmount = Math.max(maxAmount, thisRobMaxAmount);
        }
        return Math.max(lastPassMaxAmount, maxAmount);
    }

    private static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        if (nums.length == 3) return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        return Math.max(Math.max(recursion(Arrays.copyOfRange(nums, 1, nums.length-2)) + nums[nums.length-1],
                recursion(Arrays.copyOfRange(nums, 2, nums.length-1)) + nums[0]),
                recursion(Arrays.copyOfRange(nums, 0, nums.length-3)) + nums[nums.length-2]);
    }

    public static void main(String[] args) {
//        int[] nums = {6,6,4,8,4,3,3,10};
        int[] nums = {183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211};
        System.out.println(rob(nums));
//        System.out.println(recursion(nums));
    }
}
