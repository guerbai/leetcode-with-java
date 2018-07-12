package guerbai.hundredone_to_hundredfifty;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedArrayToBST {

    private static void recursion(int[] left, int[] right, TreeNode root) {
        if (left.length == 0) {
            root.left = null;
        } else {
            int leftMid = left.length / 2;
            root.left = new TreeNode(left[leftMid]);
            recursion(Arrays.copyOfRange(left, 0, leftMid), Arrays.copyOfRange(left, leftMid+1, left.length), root.left);
        }
        if (right.length == 0) {
            root.right = null;
        } else {
            int rightMid = right.length / 2;
            root.right = new TreeNode(right[rightMid]);
            recursion(Arrays.copyOfRange(right, 0, rightMid), Arrays.copyOfRange(right, rightMid+1, right.length), root.right);
        }
    }

    private static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        recursion(Arrays.copyOfRange(nums, 0, mid), Arrays.copyOfRange(nums, mid+1, nums.length), root);
        return root;
    }
}
