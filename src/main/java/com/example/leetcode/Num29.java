package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num29, v0.1 2020/4/18 3:53 下午
 */
public class Num29 {

    public int divide(int dividend, int divisor) {
        if (dividend ==Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        //正负号判断
        boolean flag = (dividend >= 0) == (divisor >= 0);

        long a = Math.abs(dividend);
        long b = Math.abs(divisor);

        long result = 0;
        while (a >= b) {
            int temp = 0;
            while (a >= (b<<temp)) {
                temp++;
            }
            a -= b << (temp - 1);
            result += 1 << (temp - 1);
        }
        return flag ? (int) result : -(int) result;
    }

}
