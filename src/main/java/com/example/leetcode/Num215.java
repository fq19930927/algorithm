/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author liuxing
 * @version Num215, v0.1 2020-01-31 19:26
 */
public class Num215 {

    public int findKthLargest(int[] nums, int k) {
        //大顶堆
        PriorityQueue<Integer> heap =
                new PriorityQueue<>(Comparator.comparingInt(n -> n));

        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.poll();
    }
}
