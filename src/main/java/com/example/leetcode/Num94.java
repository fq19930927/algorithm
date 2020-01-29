/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxing
 * @version Num94, v0.1 2020-01-29 19:35
 */
public class Num94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        ergodic(list, root);
        return list;
    }

    private void ergodic(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            ergodic(list, root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            ergodic(list, root.right);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
