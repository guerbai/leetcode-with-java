package guerbai.fiftyone_to_hundred;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class IsSameTree {

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null) return false;
        if (q == null && p != null) return false;
        if (p == null && q == null) return true;
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
