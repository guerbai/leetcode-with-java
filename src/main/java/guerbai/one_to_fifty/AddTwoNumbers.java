package guerbai.one_to_fifty;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers {

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode resultPointer = result;
        int higher = 0;
        boolean merge = l1!=null && l2!=null;
        while (merge) {
            resultPointer.val = (l1.val+l2.val+higher)%10;
            higher = (l1.val+l2.val+higher) / 10;
            l1 = l1.next;
            l2 = l2.next;
            merge = (l1!=null && l2!=null);
            if (merge) {
                resultPointer.next = new ListNode(0);
                resultPointer = resultPointer.next;
            }
        }
        ListNode rest;
        if (l1!=null) {
            rest = l1;
        } else {
            rest = l2;
        }
        if (rest != null) {
            while (rest!=null) {
                resultPointer.next = new ListNode(0);
                resultPointer = resultPointer.next;
                resultPointer.val = (rest.val+higher)%10;
                higher = (rest.val+higher) / 10;
                rest = rest.next;
            }
        }
        if (higher==1) {
            resultPointer.next = new ListNode(1);
        }
        return result;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        ListNode result = addTwoNumbers(l1, l2);
//        while (result!=null) {
//            System.out.println(result.val);
//            result = result.next;
//        }

//        ListNode l3 = new ListNode(5);
//        ListNode l4 = new ListNode(5);
//        ListNode result1 = addTwoNumbers(l3, l4);
//        while (result1!=null) {
//            System.out.println(result1.val);
//            result1 = result1.next;
//        }

        ListNode l5 = new ListNode(1);
        l5.next = new ListNode(8);
        ListNode l6 = new ListNode(0);
        ListNode result1 = addTwoNumbers(l5, l6);
        while (result1!=null) {
            System.out.println(result1.val);
            result1 = result1.next;
        }

    }
}
