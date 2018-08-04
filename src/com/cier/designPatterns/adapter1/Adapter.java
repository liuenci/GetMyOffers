package com.cier.designPatterns.adapter1;

public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("新方法");
    }
}
