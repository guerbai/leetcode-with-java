package guerbai.f601_650;

import guerbai.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevels {

    private static void recursion(TreeNode root, int ceng, List<List<Double>> result) {
        if (root == null) return;
        while (result.size() < ceng) {
            result.add(new ArrayList<>());
        }
        result.get(ceng-1).add((double) root.val);
        if (root.left != null) {
            recursion(root.left, ceng+1, result);
        }
        if (root.right != null) {
            recursion(root.right, ceng+1, result);
        }
    }

    // 此是dfs解法，此外还有bfs解法
    // https://leetcode.com/problems/average-of-levels-in-binary-tree/solution/
    // 上面link有关于bfs的基本思想.
    private static List<Double> averageOfLevels(TreeNode root) {
        List<List<Double>> resultCollector = new ArrayList<>();
        recursion(root, 1, resultCollector);
        List<Double> result = new ArrayList<>();
        for (List<Double> ceng: resultCollector) {
            double i = 0;
            for (double d: ceng) {
                i += d;
            }
            result.add(i/ceng.size());
        }
        return result;
    }
}
