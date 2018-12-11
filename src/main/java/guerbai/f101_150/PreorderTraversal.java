package guerbai.f101_150;

import java.util.ArrayList;
import java.util.List;

import guerbai.util.TreeNode;

public class PreorderTraversal {

    public void recursion(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        recursion(root.left, result);
        recursion(root.right, result);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }

}