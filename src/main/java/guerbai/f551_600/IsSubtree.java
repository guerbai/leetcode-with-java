package guerbai.f551_600;

import guerbai.util.TreeNode;

public class IsSubtree {

    private static boolean match(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return match(s.left, t.left) && match(s.right, t.right);
    }

    private static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null) return false;
        if (t == null) return true;
        if (s.val == t.val) {
            return match(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }
}
