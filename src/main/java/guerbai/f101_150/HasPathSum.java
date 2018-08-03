package guerbai.f101_150;

public class HasPathSum {

    private static boolean recursion(TreeNode root, int sum, int nowSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return nowSum + root.val == sum;
        return recursion(root.left, sum, nowSum+root.val) ||
                recursion(root.right, sum, nowSum+root.val);
    }

    private static boolean hasPathSum(TreeNode root, int sum) {
        return recursion(root, sum, 0);
    }
}
