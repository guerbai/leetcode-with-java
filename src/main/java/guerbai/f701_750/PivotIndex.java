package guerbai.f701_750;

public class PivotIndex {

    // 编程珠玑中见过的例子。
    private static int prvotIndex(int[] nums) {
        int[] sums = new int[nums.length+1];
        sums[0] = 0;
        int nowSum = 0;
        for (int i=0; i<nums.length; i++) {
            nowSum += nums[i];
            sums[i+1] = nowSum;
        }
        for (int i=0; i<nums.length; i++) {
            int ls = sums[i];
            int rs = sums[nums.length] - sums[i+1];
            if (ls == rs) {
                return i;
            }
        }
        return -1;
    }


    // 此方法并不可行，因为数字可能是负数，会使得逻辑错误。
    private static int terriblePivotIndex(int[] nums) {
        if (nums.length < 2) return -1;
        int l = 0;
        int r = nums.length - 1;
        int ls = nums[l];
        int rs = nums[r];
        while (l < r) {
            if (ls >= rs) {
                r--;
                rs += nums[r];
            } else {
                l++;
                ls += nums[l];
            }
        }
        if (ls == rs) {
            return l;
        } else {
            return -1;
        }
    }

}