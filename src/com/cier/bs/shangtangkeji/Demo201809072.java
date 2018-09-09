package com.cier.bs.shangtangkeji;

import java.util.Scanner;

public class Demo201809072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean[] booleans = new boolean[x];
        for (int i = 0; i < x; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String[][] array = new String[n][k];
            for (int j = 0; j < n;j++){
                for (int a = 0; a < k; a++){
                    array[j][a] = scanner.next();
                }
            }
        }
        for (int i = 0; i < booleans.length; i++){
            System.out.println(booleans[i]);
        }
    }
}
