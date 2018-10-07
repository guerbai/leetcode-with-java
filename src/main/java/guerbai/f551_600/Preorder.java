package guerbai.f551_600;

import java.util.ArrayList;
import java.util.List;


public class Preorder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    private static void recursion(Node root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        for (Node child: root.children) {
            recursion(child, result);
        }
    }

    private static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }
}
