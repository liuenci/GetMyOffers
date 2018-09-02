package com.cier.suanfa;

/**
 * 插入排序
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1); // 大量的交换会消耗时间
                else {
                    break;
                }
            }
        }
    }

    /**
     * 改良版的插入排序
     *
     * @param array
     */
    public static void betterSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 获取当前循环次数位置的数组元素
            int temp = array[i];
            int j = i;
            for (; j > 0; j--) {
                if (temp < array[j - 1]) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
            }
            array[j] = temp;
        }
    }

    /**
     * 交换位置
     *
     * @param array
     * @param i
     * @param j
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3, 5};
//        sort(array);
        betterSort(array);
        System.out.println("end");
    }
}
