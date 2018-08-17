package guerbai.f401_450;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LevelOrder {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    private static void recursion(Node root, List<List<Integer>> result, int index) {
        if (root == null) return;
        if (result.size() - 1 < index) {
            List<Integer> item = new ArrayList<>();
            item.add(root.val);
            result.add(item);
        } else {
            result.get(index).add(root.val);
        }
        if (root.children != null) {
            for (Node r: root.children) {
                recursion(r, result, index+1);
            }
        }
    }

    private static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(root, result, 0);
        return result;
    }

    public static void main(String[] args) {
        List<Node> kong = new ArrayList<>();
        Node root5 = new Node(5, kong);
        Node root6 = new Node(6, kong);
        List<Node> child3 = new ArrayList<>();
        child3.add(root5);
        child3.add(root6);
        Node root3 = new Node(3, child3);
        List<Node> child1 = new ArrayList<>();
        Node root2 = new Node(2, kong);
        Node root4 = new Node(4, kong);
        child1.add(root3);
        child1.add(root2);
        child1.add(root4);
        Node root1 = new Node(1, child1);
        System.out.println(levelOrder(root1));
    }

}
