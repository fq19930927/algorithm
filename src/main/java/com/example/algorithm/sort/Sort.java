package com.example.algorithm.sort;

/**
 * @author fuqiang
 * @version Sort, v0.1 2019/11/26 8:14 下午
 */
public class Sort {

    /**
     * 冒泡排序
     *
     * @param a 排序数组a
     * @param n 数组中元素个数n
     */
    public static void bubbleSort(int[] a, int n) {
        // 交换标志, 如果交换完一轮还为false则表示无数据交换
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            // 无数据交换
            if (!flag) {
                return;
            }
        }
    }

    /**
     * 插入排序
     */
    public static void insertSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            int tmp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (a[j] > tmp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = tmp;
        }
    }


    public static void main(String[] args) {
        int a[] = {3, 5, 2, 1, 7, 99, 3, 224, 0, 11};
        insertSort(a, 10);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
