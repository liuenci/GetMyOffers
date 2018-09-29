package com.cier.bs.youzan;

import java.util.Scanner;
// youzan;zanyou
public class Demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(";");

        String m = array[0];
        String n = array[1];

        if (m.equals(n)){
            System.out.println("true");
        }
        // 拿到 youzan 的 y
        char first = line.charAt(0);
        // 找到 zanyou 的 you
        int i = n.indexOf(String.valueOf(first));
        // 分割 zanyou
        String a = n.substring(0,i);
        String b = n.substring(i,n.length());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(b).append(a);

        if (m.equals(stringBuffer.toString())){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
