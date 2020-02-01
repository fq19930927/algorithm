/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.util.Arrays;

/**
 * @author liuxing
 * @version Num88, v0.1 2020/2/1 8:42 下午
 */
public class Num88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length < m + n) {
            return;
        }
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
