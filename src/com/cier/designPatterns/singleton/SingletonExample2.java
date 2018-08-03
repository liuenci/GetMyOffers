package com.cier.designPatterns.singleton;

/**
 * 线程不安全的懒汉式
 */
public class SingletonExample2 {
    // 声明变量
    public static SingletonExample2 instance = null;

    // 私有化构造函数
    private SingletonExample2() {

    }

    // 提供对外方法
    public static SingletonExample2 getInstance() {
        if (instance == null) {
            instance = new SingletonExample2();
        }
        return instance;
    }
}
