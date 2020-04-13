package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num6, v0.1 2020/4/12 10:54 下午
 */
public class Num6 {

    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int row = 0;
        //增长行数
        int increment = 1;
        for (int i = 0; i < s.length(); i++) {
            sbs[row].append(s.charAt(i));
            if ((row == numRows - 1 || row == 0) && i != 0) {
                increment = - increment;
            }
            row  = row + increment;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sbs.length; i++) {
            sb.append(sbs[i]);
        }
        return sb.toString();
    }

}
