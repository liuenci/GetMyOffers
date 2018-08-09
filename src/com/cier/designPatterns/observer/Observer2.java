package com.cier.designPatterns.observer;

public class Observer2 implements Observer{
    @Override
    public void update() {
        System.out.println("第二个观察者已经接收到了");
    }
}
