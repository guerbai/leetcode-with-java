package guerbai.f501_550;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import guerbai.util.TreeNode;

public class FindMode {

    private static void recursion(TreeNode root, Map<Integer, Integer> m, int maxCount) {
        if (root == null) return;
        m.put(root.val, 1 + m.getOrDefault(root.val, 0));
        recursion(root.left, m, maxCount);
        recursion(root.right, m, maxCount);
    }

    private static int[] findMode(TreeNode root) {
        int maxCount = 0;
        Map<Integer, Integer> m = new HashMap<>();
        recursion(root, m, maxCount);
        List<Integer> r = new ArrayList<>();
        for (Integer k: m.keySet()) {
            if (m.get(k) > maxCount) {
                maxCount = m.get(k);
            }
        }
        for (Integer k: m.keySet()) {
            if (m.get(k) == maxCount) {
                r.add(k);
            }
        }
        int[] result = new int[r.size()];
        for (int i=0; i<r.size(); i++) {
            result[i] = r.get(i);
        }
        return result;
    }

}
