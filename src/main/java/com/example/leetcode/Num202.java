/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liuxing
 * @version Num202, v0.1 2020-01-28 19:31
 */
public class Num202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int num = 0;
        while (true) {
            while (n!= 0) {
                num += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (num == 1) {
                return true;
            }
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            n = num;
            num = 0;
        }
    }
}
