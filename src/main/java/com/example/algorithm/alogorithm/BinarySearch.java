package com.example.algorithm.alogorithm;

/**
 * 二分查找
 *
 * @author fuqiang
 * @version BinarySearch, v0.1 2020/1/11 5:34 下午
 */
public class BinarySearch {

    /**
     * @param nums  静态数组数据
     * @param n     数组大小
     * @param value 需要查找的值
     * @return 返回的数组位置
     */
    public int binarySearch(int[] nums, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) >> 1;
            if (nums[mid] == value) {
                return mid;
            } else if (nums[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 查找第一个等于值的元素
     *
     * @param nums
     * @param n
     * @param value
     * @return
     */
    public int searchFirstValue(int[] nums, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) >> 1;
            if (nums[mid] > value) {
                high = mid - 1;
            } else if (nums[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || nums[mid - 1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找最后一个等于值的元素
     *
     * @param nums
     * @param n
     * @param value
     * @return
     */
    public int searchLastValue(int[] nums, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) >> 2;
            if (nums[mid] > value) {
                high = mid - 1;
            } else if (nums[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == n - 1 || nums[mid + 1] != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }


    /**
     * 查找第一个大于等于值的元素
     *
     * @param nums
     * @param n
     * @param value
     * @return
     */
    public int searchFirstMax(int[] nums, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) >> 1;
            if (nums[mid] >= value) {
                if (mid == 0 || nums[mid - 1] < value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找最后一个小于等于值的元素位置
     *
     * @param nums
     * @param n
     * @param value
     * @return
     */
    public int searchLastMin(int[] nums, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) >> 1;
            if (nums[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || nums[mid + 1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
