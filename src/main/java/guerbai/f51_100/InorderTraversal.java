package guerbai.f51_100;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    private void recursion(TreeNode root, List<Integer> result) {
        if (root == null) return;
        recursion(root.left, result);
        result.add(root.val);
        recursion(root.right, result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();        
        recursion(root, result);
        return result;
    }
}