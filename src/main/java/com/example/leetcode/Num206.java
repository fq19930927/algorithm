/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

/**
 * @author liuxing
 * @version Num206, v0.1 2020/2/9 7:58 下午
 */
public class Num206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode pre = null;
        while (curr.next != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        curr.next = pre;
        return curr;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
