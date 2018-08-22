package com.cier.base.sta;

public class Test1 {
    static int x = 10;

    static {
        x += 5;
    }

    static {
        x /= 3;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);
    }
}
