/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

/**
 * @author liuxing
 * @version Num1038, v0.1 2020-01-30 20:47
 */
public class Num1038 {

    public TreeNode bstToGst(TreeNode root) {
        findMax(root, 0);
        return root;
    }

    private int findMax(TreeNode treeNode, int val) {
        if (treeNode == null) {
            return val;
        }
        treeNode.val += findMax(treeNode.right, val);
        return findMax(treeNode.left, treeNode.val);
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
