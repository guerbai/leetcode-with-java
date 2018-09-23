package guerbai.f301_350;

public class NumArray307 {

    int[] nums;
    int[] sums;

    public NumArray307(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length];
        for (int i=0; i<sums.length; i++) {
            if (i == 0) {
                sums[i] = nums[i];
            } else {
                sums[i] = sums[i-1] + nums[i];
            }
        }
    }

    public void update(int i, int val) {
        int origin = nums[i];
        nums[i] = val;
        for (int j=i; j<sums.length; j++) {
            sums[j] += val - origin;
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? sums[j] : sums[j] - sums[i-1];
    }

}
