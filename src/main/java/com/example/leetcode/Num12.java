package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num12, v0.1 2020/4/14 6:07 下午
 */
public class Num12 {

    public String intToRoman(int num) {
        String[] I = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] II = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] III = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] IIII = new String[]{"", "M", "MM", "MMM"};
        return IIII[num/1000] + III[num/100%10] +II[num/10%10] + I[num%10];
    }

}
