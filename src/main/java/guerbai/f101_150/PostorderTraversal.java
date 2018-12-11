package guerbai.f101_150;

import java.util.ArrayList;
import java.util.List;

import guerbai.util.TreeNode;

public class PostorderTraversal {

    public void recursion(TreeNode root, List<Integer> result) {
        if (root == null) return;
        recursion(root.left, result);
        recursion(root.right, result);
        result.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }

}