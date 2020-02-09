/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

/**
 * @author liuxing
 * @version Num104, v0.1 2020/2/9 8:17 下午
 */
public class Num104 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
