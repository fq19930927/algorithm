package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num283, v0.1 2020/4/8 10:54 下午
 */
public class Num283 {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] != 0) {
                nums[i] = nums[i + 1];
                nums[i + 1] = 0;
            }
            if (i > 0 && nums[i - 1] == 0 && nums[i] !=0) {
                swapZero(nums, nums[i], i);
            }
        }
    }

    private void swapZero(int[] nums, int num, int i) {
        if ((i > 0 && nums[i - 1] != 0) || i < 1) {
            return;
        }
        nums[i - 1] = num;
        nums[i] = 0;
        swapZero(nums, nums[i - 1], i - 1);
    }
}
