package com.cier.bs.xinyongka;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        String n = scanner.nextLine();
        String[] marr = m.split(" ");
        String[] narr = n.split(" ");
        sort(marr);
        sort(narr);
        if (Integer.parseInt(narr[0]) >= Integer.parseInt(marr[marr.length - 1])) {
            System.out.println(narr.length);
        }else {
            if (Integer.parseInt(narr[narr.length - 1]) > Integer.parseInt(marr[0])) {
                System.out.println(0);
            }
        }

    }

    private static void sort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (Integer.parseInt(array[j]) > Integer.parseInt(array[j - 1])) {
                    String temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
