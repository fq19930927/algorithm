package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num167, v0.1 2020/4/9 11:42 下午
 */
public class Num167 {
    public int[] twoSum(int[] numbers, int target) {
        //双指针
        if (numbers == null || numbers.length <2) {
            return numbers;
        }
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[] {start + 1, end + 1};
            } else if (numbers[start] + numbers[end] > target) {
                end = end - 1;
            } else {
                start = start + 1;
            }
        }
        return null;

    }
}
