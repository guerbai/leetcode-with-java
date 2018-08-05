package guerbai.f51_100;

public class MaxSubArray {

    private static int maxSubArray(int[] nums) {
        int singleMax = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > singleMax) {
                singleMax = nums[i];
            }
        }
        int maxEndingHere = 0;
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere+nums[i], 0);
            max = Math.max(max, maxEndingHere);
        }
        if (max == 0 && singleMax < 0) return singleMax;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
