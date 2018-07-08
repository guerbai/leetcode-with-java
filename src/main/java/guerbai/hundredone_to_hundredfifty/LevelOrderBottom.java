package guerbai.hundredone_to_hundredfifty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderBottom {

    private static void recursion(TreeNode root, int depth, List<List<Integer>> result) {
        if (root == null) return;
        if (result.size() == depth) result.add(new ArrayList<>());
        if (root.left != null) result.get(depth).add(root.left.val);
        if (root.right!= null) result.get(depth).add(root.right.val);
        recursion(root.left, depth+1, result);
        recursion(root.right, depth+1, result);
    }

    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<Integer> first = new ArrayList<>();
        first.add(root.val);
        result.add(first);
        recursion(root, 1, result);
        result.remove(result.size()-1);
        Collections.reverse(result);
        return result;
    }
}
