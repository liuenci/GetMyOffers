package com.cier.designPatterns.observer;

public class MySubject extends AbstractSubject{
    @Override
    public void operation() {
        System.out.println("自身更新了");
        notifyObservers();
    }
}
