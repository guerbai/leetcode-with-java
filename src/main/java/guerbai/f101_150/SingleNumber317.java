package guerbai.f101_150;

public class SingleNumber317 {

    // https://leetcode.com/problems/single-number-ii/discuss/43294/Challenge-me-thx
    // 用两个big set来达到一个数出现三次后，可以把该数字出现的效果完全抵消；
    // 比如3出现3次，结果分别是: 0011, 0000; 0000, 0011; 0000, 0000;
    private static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int i=0; i<nums.length; i++) {
            // 把num加入ones，当且仅当twos中不含有该数；若已在ones中则把num从ones中取出来；
            ones = (ones ^ nums[i]) & ~ twos;
            // 把num加入twos，当且仅当ones中不含有该数；ones中有说明是上一行刚加入的；
            twos = (twos ^ nums[i]) & ~ ones;
        }
        return ones;
    }
}