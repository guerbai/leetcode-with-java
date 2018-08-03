package guerbai.f151_200;

import guerbai.util.ListNode;

public class GetIntersectionNode {

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = 0;
        int bLen = 0;
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        while (pointerA != null) {
            aLen++;
            pointerA = pointerA.next;
        }
        while (pointerB != null) {
            bLen++;
            pointerB = pointerB.next;
        }
        pointerA = headA;
        pointerB = headB;
        if (aLen < bLen) {
            int sub = bLen - aLen;
            while (sub > 0) {
                pointerB = pointerB.next;
                sub--;
            }
        } else {
            int sub = aLen - bLen;
            while (sub > 0) {
                pointerA = pointerA.next;
                sub--;
            }
        }
        while (pointerA != null && pointerB != null) {
            if (pointerA == pointerB) {
                return pointerA;
            }
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = null;
        getIntersectionNode(a, b);
    }
}
