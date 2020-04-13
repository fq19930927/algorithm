package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num8, v0.1 2020/4/13 9:21 下午
 */
public class Num8 {

    public int myAtoi(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        int j = i;
        //正负数标记
        boolean flag = true;
        if (j < str.length()) {
            if (str.charAt(j) == '+') {
                j++;
            } else if(str.charAt(j) == '-') {
                flag = false;
                j++;
            }
        }
        long result = 0;
        while (j < str.length() && Character.isDigit(str.charAt(j))) {
            result = result * 10 + (str.charAt(j) - '0');
            if (flag) {
                if (result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (-result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            j++;
        }
        if (!flag) {
            result = -result;
        }
        return (int)result;
    }
}
