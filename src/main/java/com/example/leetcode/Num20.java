/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.util.Stack;

/**
 * @author liuxing
 * @version Num20, v0.1 2020/2/16 9:39 下午
 */
public class Num20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if ('(' == charArray[i] || '{' == charArray[i] || '[' == charArray[i]) {
                stack.push(charArray[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if (charArray[i] == ')' && pop != '(') {
                    return false;
                }
                if (charArray[i] == ']' && pop != '[') {
                    return false;
                }
                if (charArray[i] == '}' && pop != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
