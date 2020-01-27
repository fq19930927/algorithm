/*
 * @Copyright: 2018-2019 liuxing All rights reserved.
 */
package com.example.leetcode;

import java.util.*;

/**
 * @author liuxing
 * @version Num49, v0.1 2020-01-27 19:34
 */
public class Num49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
