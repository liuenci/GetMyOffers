package com.cier.designPatterns.singleton;

/**
 * 饿汉式
 */
public class SingletonExample1 {
    // 直接创建对象
    public static SingletonExample1 instance = new SingletonExample1();

    // 私有化构造函数
    private SingletonExample1(){

    }
    // 返回对象实例
    public static SingletonExample1 getInstance(){
        return instance;
    }
}
