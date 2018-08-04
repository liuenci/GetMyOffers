package com.cier.designPatterns.adapter2;


/**
 * 对象的适配器模式
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("目标方法");
    }
}
