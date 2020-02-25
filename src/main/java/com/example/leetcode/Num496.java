package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author fuqiang
 * @version Num42, v0.1 2020/2/18 9:11 下午
 */
public class Num496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for (int value : nums2) {
            while (!stack.isEmpty() && stack.peek() < value) {
                map.put(stack.pop(), value);
            }
            stack.push(value);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
