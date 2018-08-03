package guerbai.f101_150;

public class IsBalanced {

    private static int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left)+1, height(root.right)+1);
    }

    private static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(height(root.left) - height(root.right)) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }
}
