package guerbai.f851_900;

import guerbai.util.ListNode;

public class MiddleNode {

    private static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode pointer = head;
        while (pointer != null) {
            pointer = pointer.next;
            length++;
        }
        System.out.println(length);
        int targetIndex = length / 2;
        while (targetIndex > 0) {
            head = head.next;
            targetIndex--;
        }
        return head;        
    }
}