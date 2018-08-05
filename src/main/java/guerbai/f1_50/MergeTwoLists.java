package guerbai.f1_50;

public class MergeTwoLists {

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null) return null;
        ListNode result;
        ListNode pointer;
        if (l1==null) return l2;
        if (l2==null) return l1;
        if (l1.val<l2.val) {
            result = new ListNode(l1.val);
            pointer = result;
            l1 = l1.next;
        } else {
            result = new ListNode(l2.val);
            pointer = result;
            l2 = l2.next;
        }
        while (l1!=null && l2!=null) {
            if (l1.val<l2.val) {
                pointer.next = new ListNode(l1.val);
                l1 = l1.next;
                pointer = pointer.next;
            } else {
                pointer.next = new ListNode(l2.val);
                l2 = l2.next;
                pointer = pointer.next;
            }
        }
        if (l1!=null) pointer.next=l1;
        if (l2!=null) pointer.next=l2;
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        mergeTwoLists(l1, l2);
    }

}
