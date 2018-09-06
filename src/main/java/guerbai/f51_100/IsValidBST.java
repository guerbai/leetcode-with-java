package guerbai.f51_100;

public class IsValidBST {

    private static boolean recursion(TreeNode root, long biggerThar, long smallThan) {
        if (root == null) return true;
        boolean validVal = root.val > biggerThar && root.val < smallThan;
        boolean leftValid = root.left == null || (root.left.val < root.val && recursion(root.left, biggerThar, Math.min(smallThan, root.val)));
        boolean rightValid = root.right == null || (root.right.val > root.val && recursion(root.right, Math.max(biggerThar, root.val), smallThan));
        return validVal && leftValid && rightValid;
    }

    private static boolean isValidBST(TreeNode root) {
        return recursion(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
//        TreeNode ten = new TreeNode(10);
//        TreeNode five = new TreeNode(5);
//        TreeNode tenfive = new TreeNode(15);
//        TreeNode six = new TreeNode(6);
//        TreeNode twoten = new TreeNode(20);
//        ten.left = five;
//        ten.right = tenfive;
//        tenfive.left = six;
//        tenfive.right = twoten;
//        System.out.println(isValidBST(ten));
//        [-2147483648,null,2147483647]
//        int min = -2147483648;
//        int max = 2147483647;
        TreeNode min = new TreeNode(-2147483648);
        TreeNode max = new TreeNode(2147483647);
        min.right = max;
        System.out.println(isValidBST(min));
    }
}
