package com.cier.base.sta;

public class A extends B{
    static {
        System.out.println("子类A静态代码块");
    }

    public A(){
        System.out.println("子类A构造函数");
    }

    {
        System.out.println("子类A非静态代码块");
    }

    public static void main(String[] args) {
        new A();
    }

    @Override
    void m2() {
        super.m2();
    }

    @Override
    protected void m3() {
        super.m3();
    }
}
