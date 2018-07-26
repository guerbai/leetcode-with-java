package guerbai.twozeroone_to_twofivezero;

import guerbai.util.TreeNode;

public class InvertTree {

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;
    }
}
