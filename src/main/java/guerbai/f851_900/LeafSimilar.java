package guerbai.f851_900;

import java.util.ArrayList;
import java.util.List;

import guerbai.util.TreeNode;

public class LeafSimilar {

    private void recursion(TreeNode root, List<Integer> leaf) {
        if (root ==  null) return;
        if (root.left == null && root.right == null) { 
            leaf.add(root.val);
            return;
        }
        if (root.left != null) {
            recursion(root.left, leaf);
        }
        if (root.right != null) {
            recursion(root.right, leaf);
        }
    }    
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        recursion(root1, leaf1);
        recursion(root2, leaf2);
        return leaf1.equals(leaf2);        
    }
    
}