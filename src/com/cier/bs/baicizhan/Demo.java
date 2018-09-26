package com.cier.bs.baicizhan;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        String n = scanner.nextLine();
        String[] marr = m.split(":");
        String[] narr = n.split(":");
        if (Integer.parseInt(narr[2]) < Integer.parseInt(marr[2])) {
            int num = Integer.parseInt(narr[2]) + 60;
            narr[2] = String.valueOf(num);
            narr[1] = String.valueOf(Integer.parseInt(narr[1]) - 1);
        }

        if (Integer.parseInt(narr[1]) < Integer.parseInt(marr[1])) {
            int num = Integer.parseInt(narr[1]) + 60;
            narr[1] = String.valueOf(num);
            narr[0] = String.valueOf(Integer.parseInt(narr[0]) - 1);
        }
        double hour = (Integer.parseInt(narr[0]) - Integer.parseInt(marr[0])) * 30 + (Integer.parseInt(narr[1]) - Integer.parseInt(marr[1])) / 60 * 30 + (Integer.parseInt(narr[2]) - Integer.parseInt(marr[2])) / 3600 * 30;
        System.out.println((int) Math.floor(hour));
        double minute = (Integer.parseInt(narr[0]) - Integer.parseInt(marr[0])) * 60 * 6 + ((Integer.parseInt(narr[1]) - Integer.parseInt(marr[2])) * 6) + (Integer.parseInt(narr[2]) - Integer.parseInt(marr[1])) * 6 / 60;
        System.out.println((int) Math.floor(minute));
        double second = (Integer.parseInt(narr[0]) - Integer.parseInt(marr[0])) * 60 * 360 + (Integer.parseInt(narr[1]) - Integer.parseInt(marr[1]))  * 60 * 6 + (Integer.parseInt(narr[2]) - Integer.parseInt(marr[2])) /6;
        System.out.println((int) Math.floor(second));
    }
}
