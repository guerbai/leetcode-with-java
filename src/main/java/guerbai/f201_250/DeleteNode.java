package guerbai.f201_250;

import guerbai.util.ListNode;

public class DeleteNode {

    private static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
