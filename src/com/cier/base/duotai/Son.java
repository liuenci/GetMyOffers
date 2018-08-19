package com.cier.base.duotai;

public class Son extends Father{
    @Override
    public void say() {
        System.out.println("son");
    }

    public static void action(){
        System.out.println("打打！");
    }
}
