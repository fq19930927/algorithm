/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuxing
 * @version Num1, v0.1 2020/2/1 8:46 下午
 */
public class Num1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[] {map.get(num),i};
            }
            map.put(nums[i], i);
        }
        return null;

    }
}
