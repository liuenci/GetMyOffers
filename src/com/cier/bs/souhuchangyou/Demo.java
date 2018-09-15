package com.cier.bs.souhuchangyou;

import java.util.HashMap;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] chars = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length;i++){
            if (map.containsKey(chars[i])){
                System.out.println(chars[i]);
                return;
            }
            map.put(chars[i],1);
        }
    }
}
