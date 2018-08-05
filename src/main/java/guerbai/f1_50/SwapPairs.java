package guerbai.f1_50;

public class SwapPairs {

    private static ListNode swapPairs(ListNode head) {
        // 这题先画图呀！
        if (head==null || head.next==null) return head;
        ListNode result = head.next;
        ListNode pointer = head;
        ListNode firstMid = pointer.next;
        pointer.next = pointer.next.next;
        firstMid.next = pointer;
        ListNode pre = pointer;
        pointer = pointer.next;
        while (pointer!=null && pointer.next!=null) {
            ListNode mid = pointer.next;
            pointer.next = pointer.next.next;
            mid.next = pointer;
            pre.next = mid;
            pre = pointer;
            pointer = pointer.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        a.next = new ListNode(1);
        a.next.next = new ListNode(4);
        a.next.next.next = new ListNode(3);
        swapPairs(a);
    }
}
