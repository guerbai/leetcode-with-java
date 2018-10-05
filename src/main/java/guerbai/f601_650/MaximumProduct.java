package guerbai.f601_650;

public class MaximumProduct {

    private static int maximumProduct(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int am = Integer.MAX_VALUE;
        int bm = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > a) {
                c = b;
                b = a;
                a = nums[i];
            } else if (nums[i] > b) {
                c = b;
                b = nums[i];
            } else if (nums[i] > c) {
                c = nums[i];
            }
            if (nums[i] < am) {
                bm = am;
                am = nums[i];
            } else if (nums[i] < bm) {
                bm = nums[i];
            }
        }
        return Math.max(a * b * c, a * am * bm);
    }

}
