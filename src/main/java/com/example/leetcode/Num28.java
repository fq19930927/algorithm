package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuqiang
 * @version Num28, v0.1 2020/4/18 3:37 下午
 */
public class Num28 {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) {
            return 0;
        }

        if (haystack == null || haystack.equals("")) {
            return -1;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i ++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
