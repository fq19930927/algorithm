package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num11, v0.1 2020/4/14 5:38 下午
 */
public class Num11 {

    public int maxArea(int[] height) {
        int begin = 0, end = height.length - 1;
        int result = 0;
        while (begin < end) {
            result = Math.max(result, (end - begin) * Math.min(height[begin], height[end]));
            if (height[begin] <= height[end]) {
                begin ++;
            } else {
                end --;
            }
        }
        return result;
    }
}
