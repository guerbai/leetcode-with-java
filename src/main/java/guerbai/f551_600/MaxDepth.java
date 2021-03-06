package guerbai.f551_600;

import java.util.List;


public class MaxDepth {

    private static int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null) return 1;
        int childMaxDepth = 0;
        for (int i=0; i<root.children.size(); i++) {
            int depth = maxDepth(root.children.get(i));
            if (depth > childMaxDepth) {
                childMaxDepth = depth;
            }
        }
        return childMaxDepth + 1;
    }
}
