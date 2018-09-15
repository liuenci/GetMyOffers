package com.cier.bs.aiqiyi;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String m = str.substring(0, 3);
        String n = str.substring(3, str.length());
        int first = 0;
        for (int i = 0; i < m.length(); i++) {
            first += Integer.parseInt(String.valueOf(m.charAt(i)));
        }
        int second = 0;
        for (int i = 0; i < n.length(); i++) {
            second += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        int diff = second - first;
        if (diff == 0) {
            System.out.println(0);
        } else {
            int nums = first + second;
            int res = 0;
            if (diff > 0){

            }
        }
    }
}
