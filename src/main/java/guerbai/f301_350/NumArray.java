package guerbai.f301_350;

public class NumArray {

    int[] nums;
    int[] sum;

    public NumArray(int[] nums) {
        this.nums = nums;
        sum = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            if (i == 0) {
                sum[i] = nums[i];
            } else {
                sum[i] = nums[i] + sum[i-1];
            }
        }
    }

    public int sumRange(int i, int j) {
        int count = 0;
        for (int c=i; c<=j; c++) {
            count += nums[c];
        }
        return count;
    }

    // 编程珠玑中的一个缓存方案。
    public int sumRangeUseCache(int i, int j) {
        return i > 0 ? sum[j] - sum[i-1]: sum[j];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray na = new NumArray(nums);
        na.sumRangeUseCache(2, 5);
    }
}
