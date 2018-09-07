package guerbai.f101_150;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    private static void recursion(TreeNode root, List<Integer> path, int nowSum, int sum, List<List<Integer>> result) {
        if (root.left == null && root.right == null && nowSum + root.val == sum) {
            path.add(root.val);
            result.add(path);
            return;
        }
        if (root.left != null) {
            List<Integer> newPathl = new ArrayList<>(path);
            newPathl.add(root.val);
            recursion(root.left, newPathl, nowSum + root.val, sum, result);
        }
        if (root.right != null) {
            List<Integer> newPath = new ArrayList<>(path);
            newPath.add(root.val);
            recursion(root.right, newPath, nowSum + root.val, sum, result);
        }
    }

    private static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<Integer> path = new ArrayList<>();
        recursion(root, path, 0, sum, result);
        return result;
    }

    public static void main(String[] args) {
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode eight = new TreeNode(8);
        TreeNode oneone = new TreeNode(11);
        TreeNode onethree = new TreeNode(13);
        TreeNode four2 = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode two = new TreeNode(2);
        TreeNode five2 = new TreeNode(5);
        TreeNode one = new TreeNode(1);
        five.left = four;
        five.right = eight;
        four.left = oneone;
        eight.left = onethree;
        eight.right = four2;
        oneone.left = seven;
        oneone.right = two;
        four2.left = five2;
        four2.right = one;
        pathSum(five, 22);
    }
}
