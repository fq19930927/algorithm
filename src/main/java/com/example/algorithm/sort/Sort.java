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

    /**
     * 归并排序
     *
     * @param a
     * @param n
     */
    public static void mergeSort(int[] a, int n) {
        int[] tmp = new int[n];
        sort(a, 0, n - 1, tmp);
    }

    private static void sort(int[] a, int left, int right, int[] tmp) {
        /*if (left < right) {
            int mid = (left + right) / 2;
            // 左边归并
            sort(a, left, mid, tmp);
            // 右边归并
            sort(a, mid + 1, right, tmp);
            merge(a, left, right, mid, tmp);
        }*/
        if (left < right) {
            int mid = left + (right - left) / 2;
            //左半边排序
            sort(a, left, mid, tmp);
            //右半边排序
            sort(a, mid + 1, right, tmp);
            merge(a, left, right, mid, tmp);
        }
    }

    private static void merge(int[] a, int left, int right, int mid, int[] tmp) {
        int i = left;//左指针
        int j = mid + 1;//右指针
        int t = 0;//临时数组指针
        //两边都有数据
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                tmp[t++] = a[i++];
            } else {
                tmp[t++] = a[j++];
            }
        }
        //只有左边有数据
        while (i <= mid) {
            tmp[i++] = a[i++];
        }
        //只有右边有数据
        while (j <= right) {
            tmp[j++] = a[j++];
        }
        t = 0;
        while (left <= right) {
            a[left++] = tmp[t++];
        }
    }

   /* private static void merge(int[] a, int left, int right, int mid, int[] tmp) {
        int i = left;// 左指针序列
        int j = mid + 1;// 右指针序 列
        int t = 0;// 临时数组指针
        // 左右两边都有数据
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                tmp[t++] = a[i++];
            } else {
                tmp[t++] = a[j++];
            }
        }
        // 只有左边有数据
        while (i <= mid) {
            tmp[t++] = a[i++];
        }
        // 只有右边有数据
        while (j <= right) {
            tmp[t++] = a[j++];
        }
        t = 0;
        // 将tmp数组原位置放到数组a
        while (left <= right) {
            a[left++] = tmp[t++];
        }
    }*/

    /**
     * 快速排序
     *
     * @param arr
     * @param n
     */
    public static void quickSort(int[] arr, int n) {
        quick(arr, 0, n - 1);
    }


    private static void quick(int[] arr, int top, int tail) {
        if (top >= tail) {
            return;
        }
        int mid = arr[tail];
        int left = top, right = tail - 1;
        while (left < right) {
            while (arr[left] < mid && left < right) {
                left++;
            }
            while (arr[right] >= mid && left < right) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        if (arr[left] >= arr[tail]) {
            int temp = arr[left];
            arr[left] = arr[tail];
            arr[tail] = temp;
        } else {
            left++;
        }
        quick(arr, top, left - 1);
        quick(arr, left + 1, tail);
    }


    public static void main(String[] args) {
        int a[] = {3, 5, 2, 1, 7, 99, 3, 224, 0, 11};
        quickSort(a, 10);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
