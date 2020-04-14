package com.example.leetcode;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * @author fuqiang
 * @version Num538, v0.1 2020/4/15 12:11 上午
 */
public class Num538 {

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {

        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
