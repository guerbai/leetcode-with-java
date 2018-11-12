package guerbai.f101_150;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {

    private void recursion(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) return;
        while (result.size() < level + 1) {
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(root.val);
        recursion(root.left, level+1, result);
        recursion(root.right, level+1, result);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(root, 0, result);
        return result;
    }
}