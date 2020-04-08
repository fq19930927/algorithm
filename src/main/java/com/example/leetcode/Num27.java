package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num27, v0.1 2020/4/8 11:21 下午
 */
public class Num27 {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
