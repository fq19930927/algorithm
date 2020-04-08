package com.example.leetcode;

import java.awt.font.NumericShaper;

/**
 * @author fuqiang
 * @version Num66, v0.1 2020/4/8 11:27 下午
 */
public class Num66 {

    public int[] plusOne(int[] digits) {
        //解法1，转成int型+1，再转数组
        //解法2
        if (digits == null || digits.length == 0) {
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    private void change(int[] digits, int digit) {
        if (digit != 9) {
            digits[digit] = digits[digit] + 1;
            return;
        }
        change(digits, digit - 1);
    }
}
