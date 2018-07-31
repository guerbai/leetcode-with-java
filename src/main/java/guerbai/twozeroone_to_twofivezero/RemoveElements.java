package guerbai.twozeroone_to_twofivezero;

import guerbai.util.ListNode;

public class RemoveElements {

    private static ListNode removeElements(ListNode head, int val) {
        ListNode pointer = head;
        while (pointer != null && pointer.val == val) {
            pointer = pointer.next;
        }
        ListNode result = pointer;
        while (pointer != null && pointer.next != null) {
            if (pointer.next.val == val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return result;
    }
}
