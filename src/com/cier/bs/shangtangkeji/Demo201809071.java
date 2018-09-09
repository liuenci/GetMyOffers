package com.cier.bs.shangtangkeji;

import java.util.Scanner;

public class Demo201809071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        betterSort(array);
        int mid = 0;
        if (array.length % 2 == 0) {
            mid = array.length / 2;
        } else {
            int l = array[array.length / 2];
            int m = array[array.length / 2 - 1];
            int r = array[array.length / 2 + 1];
            if (r - m < m - l){
                mid = array.length / 2;
            } else {
                mid = array.length / 2 + 1;
            }
        }

        for (int i = 0; i < mid; i++) {
            array[i] += k;
        }
        for (int i = mid; i < array.length; i++) {
            array[i] -= k;
        }
        betterSort(array);
        System.out.println(array[array.length - 1] - array[0]);
    }

    private static void betterSort(int[] array) {
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
}
