package guerbai.f1_50;

public class MergeKLists {

    private static ListNode mergeKLists(ListNode[] lists) {
        // find first element, count length.
        int length = 0;
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        int index = 0;
        for (ListNode list: lists) {
            if (list!=null && list.val<minValue) {
                minValue = list.val;
                minIndex = index;
            }
            while (list!=null) {
                length++;
                list = list.next;
            }
            index++;
        }
        if (length==0) return null;
        ListNode result = new ListNode(lists[minIndex].val);
        ListNode pointer = result;
        lists[minIndex] = lists[minIndex].next;
        int nowLength = 1;
        while (nowLength < length) {
            int min = Integer.MAX_VALUE;
            int minIndexInner = 0;
            int indexInner = 0;
            for (ListNode list: lists) {
                if (list!=null && list.val<min) {
                    min = list.val;
                    minIndexInner = indexInner;
                }
                indexInner++;
            }
            pointer.next = new ListNode(min);
            pointer = pointer.next;
            lists[minIndexInner] = lists[minIndexInner].next;
            nowLength++;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(5);
        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);
        ListNode c = new ListNode(2);
        c.next = new ListNode(6);
        ListNode[] s = {a, b, c};
        mergeKLists(s);
    }
}
