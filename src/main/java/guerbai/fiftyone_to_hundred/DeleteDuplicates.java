package guerbai.fiftyone_to_hundred;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteDuplicates {

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode result = head;
        ListNode pre = head;
        ListNode pointer = head.next;
        while (pointer != null) {
            if (pointer.val == pre.val) {
                pre.next = pointer.next;
                pointer = pre.next;
            } else {
                pre = pre.next;
                pointer = pointer.next;
            }
        }
        return result;
    }
}
