package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author fuqiang
 * @version Num4, v0.1 2020/4/11 7:55 下午
 */
public class Num4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        if (list.size()%2 == 0) {
            return (list.get(list.size()/2) + list.get(list.size()/2 - 1))/2f;
        } else {
            return list.get(list.size()/2);
        }
    }
}
