package guerbai.twozeroone_to_twofivezero;

import guerbai.util.ListNode;

public class IsPalindrome {

    private static boolean isPalindrome(ListNode head) {
        ListNode pointer = head;
        int l = 0;
        while (pointer != null) {
            pointer = pointer.next;
            l++;
        }
        if (l == 0) return true;
        if (l == 1) return true;
        boolean odd = l % 2 == 1;
        int toReverseL = (l / 2) - 1;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        p1.next = null;
        // 这段变换要画图；
        while (toReverseL > 0) {
            ListNode p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            toReverseL--;
        }
        if (odd) {
            p2 = p2.next;
        }
        while (p1 != null) {
            if (p1.val == p2.val) {
                p1 = p1.next;
                p2 = p2.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
