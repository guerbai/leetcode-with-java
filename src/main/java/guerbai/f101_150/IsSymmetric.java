package guerbai.f101_150;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class IsSymmetric {

    private static boolean recursion(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null && right != null) return false;
        if (right == null && left != null) return false;
        return left.val == right.val && recursion(left.left, right.right)
                && recursion(right.left, left.right);
    }

    private static boolean isSymmetric(TreeNode root) {
        return recursion(root, root);
    }
}
