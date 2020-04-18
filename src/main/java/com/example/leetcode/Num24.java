package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num24, v0.1 2020/4/17 10:01 下午
 */
public class Num24 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode curr = dummyNode;
        while (curr.next != null && curr.next.next!= null) {
            ListNode temp1 = curr.next;
            ListNode temp2 = curr.next.next;
            temp1.next = temp2.next;
            temp2.next = temp1;
            curr.next = temp2;
            curr = curr.next.next;
        }
        return dummyNode.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
