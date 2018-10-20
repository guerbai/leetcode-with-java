package guerbai.f551_600;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Postorder {

    List<Integer> order = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return order;
        for (Node child: root.children) {
            postorder(child);
        }
        order.add(root.val);
        return order;
    }
}