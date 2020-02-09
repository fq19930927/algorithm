/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

/**
 * @author liuxing
 * @version Num21, v0.1 2020/2/9 8:24 下午
 */
public class Num21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            ListNode curr = new ListNode(l1.val);
            curr.next = mergeTwoLists(l1.next, l2);
            return curr;
        } else {
            ListNode curr = new ListNode(l2.val);
            curr.next = mergeTwoLists(l1, l2.next);
            return curr;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
