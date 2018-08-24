package com.cier.base.sta;

/**
 * 静态域最先初始化
 */
public class C {
    public static C c1 = new C();
    public static C c2 = new C();
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
