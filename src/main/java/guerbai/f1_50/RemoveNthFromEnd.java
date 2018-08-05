package guerbai.f1_50;

public class RemoveNthFromEnd {

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode[] mem = new ListNode[10000];
        ListNode pointer = head;
        int length = 0;
        while (pointer!=null) {
            length++;
            if (length==1) {
                mem[0] = head;
            } else {
                mem[length-1] = mem[length-2].next;
            }
            pointer = pointer.next;
        }
        int targetIndex = length - n;
        if (targetIndex==0) {
            return head.next;
        }
        mem[targetIndex-1].next = mem[targetIndex].next;
        return head;
    }
}
