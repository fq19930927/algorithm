package com.example.leetcode;

/**
 * @author fuqiang
 * @version Num74, v0.1 2020/1/16 9:53 下午
 */
public class Num74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (target == matrix[mid/n][mid%n]) {
                return true;
            } else if(target < matrix[mid/n][mid%n]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
