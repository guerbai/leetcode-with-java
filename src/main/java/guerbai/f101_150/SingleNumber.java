package guerbai.f101_150;

public class SingleNumber {

    // 利用异或的特性。自己异或自己为0，0异或一个数还是那个数，走一遍下来，就找到了单数。
    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int i=0; i<nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
