package guerbai.f401_450;

import guerbai.util.TreeNode;

public class SumOfLeftLeaves {

    private static int recursion(TreeNode root, int fangxiang) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            if (fangxiang == -1) {
                return root.val;
            } else {
                return 0;
            }
        } else {
            return recursion(root.left, -1) + recursion(root.right, 1);
        }
    }

    private static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return recursion(root.left, -1) + recursion(root.right, 1);
    }
}
