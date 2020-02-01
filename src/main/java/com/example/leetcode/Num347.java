/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.util.*;

/**
 * @author liuxing
 * @version Num347, v0.1 2020/2/1 7:14 下午
 */
public class Num347 {
    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> heap =
                new PriorityQueue<>(Comparator.comparingInt(count::get));

        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        List<Integer> topK = new LinkedList<>();
        while (!heap.isEmpty()) {
            topK.add(heap.poll());
        }
        Collections.reverse(topK);
        return topK;
    }
}
