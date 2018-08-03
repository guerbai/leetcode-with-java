package guerbai.f301_350;

public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int count = 0;
        for (int c=i; c<=j; c++) {
            count += nums[c];
        }
        return count;
    }
}
