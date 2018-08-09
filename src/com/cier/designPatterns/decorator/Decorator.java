package com.cier.designPatterns.decorator;

public class Decorator implements Sourceable {
    private Sourceable sourceable;
    public Decorator(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }
    @Override
    public void method() {
        System.out.println("修饰之前");
        sourceable.method();
        System.out.println("修饰之后");
    }
}
