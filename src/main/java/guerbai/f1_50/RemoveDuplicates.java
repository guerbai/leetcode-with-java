package guerbai.f1_50;

public class RemoveDuplicates {

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 1;
        int pre = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i]!=pre) {
                nums[result] = nums[i];
                result++;
                pre = nums[i];
            }
        }
        return result;
    }
}
