package com.cier.designPatterns.observer;

public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("第一个观察者已经接收到了");
    }
}
