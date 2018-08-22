package com.cier.base.sta;

public class B {
    static {
        System.out.println("父类B静态代码块");
    }

    public B(){
        System.out.println("父类B构造函数");
    }

    {
        System.out.println("父类B非静态代码块");
    }
}
