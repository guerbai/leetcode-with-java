package guerbai.f651_f700;

import guerbai.util.TreeNode;

public class SearchBST {

    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

}