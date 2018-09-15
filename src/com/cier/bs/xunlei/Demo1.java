package com.cier.bs.xunlei;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    if (a <= b && b <= c && c <= n) {
                        if (judge(a,b) && judge(a,c)&&judge(b,c)){
                            if (a * a + b * b == c * c) {
                                count++;
                            }
                        }

                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean judge(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        if (a == 1){
            return true;
        }
        return false;

    }
}
