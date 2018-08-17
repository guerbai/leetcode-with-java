package guerbai.f401_450;

public class ThirdMax {

    // 这题告诉人们要编写"正确"的程序真的不容易；
    private static int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (int i=0; i<nums.length; i++) {
            if (max == null || nums[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            } else if (nums[i] != max && (secondMax == null || nums[i] > secondMax)) {
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (nums[i] != max && nums[i] != secondMax  && (thirdMax == null || nums[i] > thirdMax)) {
                thirdMax = nums[i];
            }
        }
        if (thirdMax != null) {
            return thirdMax;
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }
}
