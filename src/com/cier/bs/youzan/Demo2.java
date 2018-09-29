package com.cier.bs.youzan;


import java.util.HashMap;
import java.util.Scanner;

// [1,2,3,4,5]
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String line1 = line.substring(1, line.length() - 1);
        String[] array = line1.split(",");

        int length = array.length - 1;
        int n = Integer.parseInt(array[0]);


        HashMap<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) + i >= length) {
                map.put(array[i], true);
            } else {
                map.put(array[i], false);
            }
        }

        for (int i = 0; i < array.length; i++) {
            int m = i;
            if (map.get(array[m])) {
                System.out.println("true");
                return;
            } else {
                while (!map.get(array[m])) {
                    m += Integer.parseInt(array[m]);
                    if (m == length && !map.get(array[m])) {
                        System.out.println("false");
                        return;
                    }
                }
                System.out.println("true");
            }
        }
    }
}
