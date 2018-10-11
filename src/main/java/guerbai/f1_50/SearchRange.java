package guerbai.f1_50;

public class SearchRange {

    private static int[] searchRange(int[] nums, int target) {
        int s = -1;
        int e = -1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target && s == -1) {
                s = i;
                e = i;
            } else if (nums[i] == target && s != -1) {
                e = i;
            }
        }
        int[] result = {s, e};
        return result;
    }

    private static int findFirstElement(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            System.out.println(l);
            System.out.println(r);
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    // explaination at: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/discuss/14701/A-very-simple-Java-solution-with-only-one-binary-search-algorithm
    private static int[] searchRangeBinarySearch(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int s = findFirstElement(nums, target);
        if (s == nums.length + 1 || nums[s] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{s, findFirstElement(nums, target+1)-1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 2,};
        System.out.println(findFirstElement(nums, 3));
    }
}
