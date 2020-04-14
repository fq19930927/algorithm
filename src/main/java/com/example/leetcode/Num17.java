package com.example.leetcode;

import java.util.*;

/**
 * @author fuqiang
 * @version Num17, v0.1 2020/4/14 8:58 下午
 */
public class Num17 {
    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});

        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        dfs(digits, result, map, 0, "");
        return result;
    }

    private void dfs(String digits, List<String> result, Map<Character,char[]> map, int start, String s) {
        if (start >= digits.length() ) {
            result.add(s);
            return;
        }
        for (char c : map.get(digits.charAt(start))) {
            dfs(digits, result, map, start+1, s + c);
        }
    }

}
