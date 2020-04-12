package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num5, v0.1 2020/4/12 8:47 下午
 */
public class Num5 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        //一个字符串的长度
        int length = 1;
        int ll = 0, rr = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1;
            int r = i + 1;
            //中心为奇数个
            while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > length) {
                    length = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }
            l = i;
            r = i+1;
            //中心为偶数个
            while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > length) {
                    length = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }
        }
        return s.substring(ll, rr+1);
    }

    public static void main(String[] args) {
        new Num5().longestPalindrome("cbbd");
    }
}
