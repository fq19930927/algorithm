package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuqiang
 * @version Num36, v0.1 2020/1/22 4:54 下午
 */
public class Num36 {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer>[] row = new HashMap[9];
        Map<Integer, Integer>[] column = new HashMap[9];
        Map<Integer, Integer>[] box = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            row[i] = new HashMap<>();
            column[i] = new HashMap<>();
            box[i] = new HashMap<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];
                if ('.' != value) {
                    int num = (int) value;
                    row[i].put(num, row[i].getOrDefault(num, 0) + 1);
                    column[j].put(num, column[j].getOrDefault(num, 0) + 1);
                    int m = (i / 3) * 3 + j / 3;
                    box[m].put(num, box[m].getOrDefault(num, 0) + 1);
                    if (row[i].get(num) > 1 || column[j].get(num) > 1 || box[m].get(num) > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
