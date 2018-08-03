package com.cier.designPatterns.singleton;

/**
 * 懒汉式
 */
public class SingletonExample2 {
    // 声明变量
    public static volatile SingletonExample2 instance = null;

    // 私有化构造函数
    private SingletonExample2(){

    }
    // 提供对外方法
    public static SingletonExample2 getInstance(){
        if (instance == null){
            synchronized (SingletonExample2.class){
                if (instance == null){
                    instance = new SingletonExample2();
                }
            }
        }
        return instance;
    }
}
