package com.cier.designPatterns.singleton;

/**
 * 懒汉式
 */
public class SingletonExample4 {
    // 声明变量
    public static volatile SingletonExample4 instance = null;

    // 私有化构造函数
    private SingletonExample4(){

    }
    // 提供对外方法
    public static SingletonExample4 getInstance(){
        if (instance == null){
            synchronized (SingletonExample4.class){
                if (instance == null){
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
