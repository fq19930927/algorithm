package com.example.leetcode;

import java.util.*;

/**
 * @author fuqiang
 * @version Num912, v0.1 2020/2/25 10:12 下午
 */
public class Num912 {

    public List<Integer> sortArray(int[] nums) {

        if (null == nums || nums.length == 0) {
            return null;
        }

        int[] temp = new int[nums.length];

        mergeSort(0, nums.length - 1, nums, temp);

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

    private void mergeSort(int left, int right, int[] nums, int[] temp) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(left, mid, nums, temp);
            mergeSort(mid + 1, right, nums, temp);

            sort(left, mid, right, nums, temp);
        }

    }

    /**
     * 归并
     *
     * @param left
     * @param mid
     * @param right
     * @param nums
     * @param temp
     */
    private void sort(int left, int mid, int right, int[] nums, int[] temp) {

        int t = 0;
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[t++] = nums[i++];
            } else {
                temp[t++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[t++] = nums[i++];
        }

        while (j <= right) {
            temp[t++] = nums[j++];
        }

        t = 0;
        while (left <= right) {
            nums[left++] = temp[t++];
        }

    }


}
