package guerbai.twozeroone_to_twofivezero;

import guerbai.util.ListNode;

public class ReverseList {

    private static ListNode recursion(ListNode reversed, ListNode remain) {
        if (remain == null) return reversed;
        ListNode nextRemain = remain.next;
        remain.next = reversed;
        return recursion(remain, nextRemain);
    }

    private static ListNode reverseList(ListNode head) {
        return recursion(null, head);
    }
}
