package guerbai.f151_200;

public class Rob {

    // mzorro.me/2016/03/15/leetcode-house-robber.
    private static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int lastPassMaxAmount = 0;
        int lastRobMaxAmount = nums[0];
        for (int i=1; i < nums.length; i++) {
            int nowRobAmount = nums[i] + lastPassMaxAmount;
            int nowPassAmount = Math.max(lastPassMaxAmount, lastRobMaxAmount);
            lastPassMaxAmount = nowPassAmount;
            lastRobMaxAmount = nowRobAmount;
        }
        return Math.max(lastPassMaxAmount, lastRobMaxAmount);
    }

    public static void main(String[] args) {
        int[] s = {1, 2, 3, 1};
        rob(s);
    }
}
