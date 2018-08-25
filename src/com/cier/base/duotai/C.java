package com.cier.base.duotai;

public class C extends B {
    static int anInt;
    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new B();
        A a2 = new C();
        anInt=1;
        int i;
        for (i = 2; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
