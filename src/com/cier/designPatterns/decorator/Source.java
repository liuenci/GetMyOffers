package com.cier.designPatterns.decorator;

public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("这是原始方法");
    }
}
