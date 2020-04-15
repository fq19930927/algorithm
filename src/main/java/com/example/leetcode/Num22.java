package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fuqiang
 * @version Num22, v0.1 2020/4/15 9:08 下午
 */
public class Num22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(n, result, new StringBuilder(), 0, 0, 0);
        return result;
    }

    private void dfs(int n, List<String> result, StringBuilder sb, int start, int left, int right) {
        if (start == n*2) {
            result.add(new String(sb));
        }
        if (left<n) {
            dfs(n, result, sb.append("("), start + 1, left+1,right);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right < left) {
            dfs(n, result, sb.append(")"), start + 1, left,right+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
