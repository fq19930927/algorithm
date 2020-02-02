/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.List;

/**
 * @author liuxing
 * @version Num234, v0.1 2020/2/2 8:20 下午
 */
public class Num234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        //定义快慢指针
        ListNode slow = head, fast = head;
        ListNode listNode1 = null, listNode2 = null;
        while (fast != null && fast.next != null) {
            listNode1 = slow;
            slow = slow.next;
            fast = fast.next.next;
            listNode1.next = listNode2;
            listNode2 = listNode1;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null && listNode1 != null) {
            if (slow.val != listNode1.val) {
                return false;
            }
            slow = slow.next;
            listNode1 = listNode1.next;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
