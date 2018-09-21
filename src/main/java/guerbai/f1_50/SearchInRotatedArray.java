package guerbai.f1_50;

public class SearchInRotatedArray {

    // find solution at: https://leetcode.com/problems/search-in-rotated-sorted-array/discuss/14436/Revised-Binary-Search
    private static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] == target) return m;
            // nums[l] == nums[m]时l == m，应该向右行，走该if下的l = m + 1;
            if (nums[l] <= nums[m]) {
                // 两个子if，识别出常见的二分情况，其他相当于递归;
                if (nums[l] <= target && nums[m] >= target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[m] <= target && nums[r] >= target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return nums[l] == target ? l : -1;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(search(nums,1));
    }

}
