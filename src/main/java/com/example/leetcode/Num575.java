package com.example.leetcode;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author fuqiang
 * @version Num575, v0.1 2020/5/12 7:54 下午
 */
public class Num575 {

    public int distributeCandies(int[] candies) {
        if (candies == null || candies.length <= 0) {
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for (int candy : candies) {
            if (!set.contains(candy)) {
                set.add(candy);
            }
        }
        if (set.size() < candies.length / 2)  {
            return set.size();
        } else {
            return candies.length / 2;
        }
    }
}
