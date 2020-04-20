/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Stack;

/**
 * @author liuxing
 * @version Num20, v0.1 2020/2/16 9:39 下午
 */
public class Num20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c =='[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c ==')' && top != '(') {
                    return false;
                }
                if (c ==']' && top != '[') {
                    return false;
                }
                if (c =='}' && top != '{') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
