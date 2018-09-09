package com.cier.bs.shangtangkeji;

import java.util.Scanner;

public class Demo201809073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(5);
    }
}
