package guerbai.f101_150;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MaxPathSumDifficult {

    // 这是我的方法，我写得很不错，在正常情况下是对的，但被testcase92卡住，这个测试数据无法构造，很难受。
    private static void setUp(TreeNode root, double index, Map<Double, Integer> m, Map<Double, Integer> usem) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            m.put(index, root.val);
            usem.put(index, root.val);
        }
        double rightIndex = index * 2 + 1;
        double leftIndex = index * 2 + 2;
        if (root.left != null) {
            setUp(root.left, leftIndex, m, usem);
        }
        if (root.right != null) {
            setUp(root.right, rightIndex, m, usem);
        }
        
        int maxUseV = Integer.MIN_VALUE;
        int[] usenums = {root.val, root.val+usem.getOrDefault(rightIndex, 0), root.val+usem.getOrDefault(leftIndex, 0)};
        for (int i: usenums) {
            if (i > maxUseV) {
                maxUseV = i;
            }
        }
        usem.put(index, maxUseV);
        
        int maxV = Integer.MIN_VALUE;
        int[] nums = {root.val, root.val+usem.getOrDefault(rightIndex, 0), root.val+usem.getOrDefault(leftIndex, 0), root.val+usem.getOrDefault(leftIndex, 0)+usem.getOrDefault(rightIndex, 0)};
        for (int i: nums) {
            if (i > maxV) {
                maxV = i;
            }
        }
        m.put(index, maxV);
    }
    
    public int maxPathSum1(TreeNode root) {
        Map<Double, Integer> m = new HashMap<>();
        Map<Double, Integer> usem = new HashMap<>();
        setUp(root, 0.0, m, usem);
        int maxPath = Integer.MIN_VALUE;
        for (Double i: m.keySet()) {
            if (m.get(i).intValue() > maxPath) {
                maxPath = m.get(i);
            }
        }
        System.out.println(m);
        System.out.println(usem);
        return maxPath;
    }

    // 抄答案。此方法避免了使用index,可以避免我的index溢出问题。
    // 我的思路它也写了出来，但更简练，晦涩。
    // 使用这种方式来共享变量，避免了传参。
    int maxValue;
    
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    
    // 难点在于此函数有两个职责；
    // 返回当前结点的maxUseV;
    // 根据该结点的子节点的maxUseV，算出此节点的maxV，与maxValue比较，更新值。
    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }

}
