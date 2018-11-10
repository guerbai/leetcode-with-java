package guerbai.f1_50;

public class FirstMissingPositive {

    private void swap(int[] A, int l, int r) {
        int temp = A[l];
        A[l] = A[r];
        A[r] = temp;
    }

    // solution:
    // https://leetcode.com/problems/first-missing-positive/discuss/17083/O(1)-space-Java-Solution
    public int firstMissingPositive(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            // 注意这个while与后面的&&，是个易错点。
            // 后面的!=是要有的，因为要防止[1, 2, 3, 4]这样已经就位的导致的死循环；
            // nums[nums[i] -1] != nums[i]是为防止[2, 2]这样导致的死循环；
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]) {
                swap(nums, i, nums[i]-1);
            }
        }
        int i=0;
        while (i < nums.length && nums[i] == i + 1) {
            i++;
        }
        return i + 1;
    }

}