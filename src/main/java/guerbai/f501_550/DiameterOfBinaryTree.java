package guerbai.f501_550;

import guerbai.util.TreeNode;

public class DiameterOfBinaryTree {

    private static int recursion(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(recursion(root.left), recursion(root.right));
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return Math.max(Math.max(recursion(root.left) + recursion(root.right), diameterOfBinaryTree(root.left)), diameterOfBinaryTree(root.right));
    }
}
