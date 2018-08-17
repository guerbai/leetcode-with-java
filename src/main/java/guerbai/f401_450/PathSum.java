package guerbai.f401_450;

import guerbai.util.TreeNode;

public class PathSum {

//    private static int recursion(TreeNode root, int sum, int sumNow) {
//        if (root == null) return 0;
//        int count = 0;
//        if (sumNow + root.val == sum) {
//            System.out.println(sumNow);
//            System.out.println(root.val);
//            count = 1;
//        }
//        if (root.left != null) {
//            count += recursion(root.left, sum, 0)
//                    + recursion(root.left, sum, sumNow + root.val);
//        }
//        if (root.right != null) {
//            count += recursion(root.right, sum, 0)
//                    + recursion(root.right, sum, sumNow + root.val);
//        }
//        return count;
//    }
//
//    private static int pathSum(TreeNode root, int sum) {
//        if (root == null) return 0;
//        return recursion(root, sum, 0);
//    }

    private static int recursion(TreeNode root, int sum) {
        if (root == null) return 0;
        return (root.val == sum ? 1 : 0) + recursion(root.left, sum-root.val) + recursion(root.right, sum-root.val);
    }

    // 这题没看明白，可记为典型的DFS；
    private static int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return recursion(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode root5 = new TreeNode(5);
        TreeNode root4 = new TreeNode(4);
        TreeNode root3 = new TreeNode(3);
        TreeNode root2 = new TreeNode(2);
        TreeNode root1 = new TreeNode(1);
        root1.right = root2;
        root2.right = root3;
        root3.right = root4;
        root4.right = root5;
        System.out.println(pathSum(root1, 3));
    }

}
