package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num200, v0.1 2020/4/20 6:33 下午
 */
public class Num200 {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int height = grid.length;
        int width = grid[0].length;
        int num = 0;
        for (int i = 0; i<height; i++) {
            for (int j = 0; j<width; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    dfs(grid, i, j, height, width);
                }
            }
        }
        return num;
    }


    private void dfs(char[][] grid, int a, int b, int height, int weight) {
        if (a < 0 || b < 0 || a >= height || b >= weight || grid[a][b] == '0') {
            return;
        }
        grid[a][b] = '0';
        dfs(grid, a - 1, b, height, weight);
        dfs(grid, a + 1, b, height, weight);
        dfs(grid, a, b - 1, height, weight);
        dfs(grid, a, b + 1, height, weight);

    }
}
