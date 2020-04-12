package com.example.leetcode;

import java.util.List;

/**
 * @author fuqiang
 * @version Num78, v0.1 2020/4/10 11:53 下午
 */
public class Num237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * Definition for singly-linked list.
     *
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
