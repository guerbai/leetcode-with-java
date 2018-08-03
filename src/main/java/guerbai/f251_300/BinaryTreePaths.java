package guerbai.f251_300;

import guerbai.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {


    private static void recursion(TreeNode root, String path, List<String> result) {
        if (root == null) return;
        boolean pathKong = "".equals(path);
        if (root.left == null && root.right == null) {
            if ("".equals(path)) {
                result.add(Integer.toString(root.val));
            } else {
                result.add(path+"->"+Integer.toString(root.val));
            }
        } else if (root.left != null && root.right != null) {
            recursion(root.left, pathKong ? Integer.toString(root.val) : path+"->"+Integer.toString(root.val), result);
            recursion(root.right, pathKong ? Integer.toString(root.val) : path+"->"+Integer.toString(root.val), result);
        } else if (root.left == null && root.right != null) {
            recursion(root.right, pathKong ? Integer.toString(root.val) : path+"->"+Integer.toString(root.val), result);
        } else {
            recursion(root.left, pathKong ? Integer.toString(root.val) : path+"->"+Integer.toString(root.val), result);
        }
    }

    private static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        recursion(root, "", result);
        return result;
    }
}
