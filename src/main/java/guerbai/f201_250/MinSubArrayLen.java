package guerbai.f201_250;

public class MinSubArrayLen {

    private static int minSubArrayLen(int s, int[] nums) {
        int l = 0;
        int sum = 0;
        int res = 0;
        for (int i = 0; i<nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                if (res == 0) {
                    res = i + 1 - l;
                } else {
                    res = Math.min(res, i + 1 - l);
                }
                sum -= nums[l];
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }
}
