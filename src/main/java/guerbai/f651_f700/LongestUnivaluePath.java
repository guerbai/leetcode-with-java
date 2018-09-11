package guerbai.f651_f700;

import guerbai.util.TreeNode;

public class LongestUnivaluePath {

    private static int recursion(TreeNode root, int val, int len) {
        if (root == null) return len;
        if (root.val == val) {
            return Math.max(recursion(root.right, val, len+1), recursion(root.left, val, len+1));
        } else {
            return len;
        }
    }

    private static int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        return Math.max(Math.max(recursion(root.left, root.val, 0)+recursion(root.right, root.val, 0), longestUnivaluePath(root.left)), longestUnivaluePath(root.right));
    }
}
