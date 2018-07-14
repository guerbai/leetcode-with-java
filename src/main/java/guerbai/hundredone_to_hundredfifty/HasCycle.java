package guerbai.hundredone_to_hundredfifty;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class HasCycle {

    private static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next!=null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == slow) return true;
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        hasCycle(head);
    }
}
