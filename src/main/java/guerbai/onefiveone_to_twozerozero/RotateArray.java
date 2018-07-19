package guerbai.onefiveone_to_twozerozero;

public class RotateArray {

    private static void subRotate(int[] nums, int pointer1, int pointer2) {
        int t;
        while (pointer2 > pointer1) {
            t = nums[pointer1];
            nums[pointer1] = nums[pointer2];
            nums[pointer2] = t;
            pointer1++;
            pointer2--;
        }
    }

    private static void rotate(int[] nums, int k) {
        k = nums.length - k % nums.length;
        subRotate(nums, 0, k - 1);
        subRotate(nums, k, nums.length - 1);
        subRotate(nums, 0, nums.length - 1);
    }
}
