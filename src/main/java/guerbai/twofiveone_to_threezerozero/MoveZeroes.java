package guerbai.twofiveone_to_threezerozero;

public class MoveZeroes {

    private static void moveZeroes(int[] nums) {
        int noZeroCount = 0;
        for (int num: nums) if (num != 0) noZeroCount++;
        int noZeroIndex = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                if (noZeroIndex != i) {
                    nums[noZeroIndex] = nums[i];
                }
                noZeroIndex++;
            }
            if (i >= noZeroCount) {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.println(nums.toString());
    }
}
