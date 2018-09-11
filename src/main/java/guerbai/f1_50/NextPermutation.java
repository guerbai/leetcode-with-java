package guerbai.f1_50;

public class NextPermutation {

    private static void swap(int[] nums, int start, int end) {
        int t = nums[start];
        nums[start] = nums[end];
        nums[end] = t;
    }

    private static void nextPermutation(int[] nums) {
        int decreIndex = -1;
        for (int i=nums.length-1; i>-1; i--) {
            if (i != 0) {
                if (nums[i] > nums[i-1]) {
                    decreIndex = i - 1;
                    break;
                }
            }
        }
        int start;
        int end = nums.length - 1;
        if (decreIndex == -1) {
            start = 0;
        } else {
            int min = Integer.MAX_VALUE;
            int changeIndex = -1;
            for (int i=decreIndex+1; i<nums.length; i++) {
                // 这个等于很重要。
                if (nums[i] <= min && nums[i] > nums[decreIndex]) {
                    min = nums[i];
                    changeIndex = i;
                }
            }
            // 考虑{1， 5， 1}
            swap(nums, decreIndex, changeIndex);
            start = decreIndex + 1;
        }
        while (start < end) {
            swap(nums, end, start);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] s = {2, 3, 1};
        nextPermutation(s);
        System.out.println("11");
    }
}
