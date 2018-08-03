package com.cier.designPatterns.singleton;

/**
 * 懒汉式
 */
public class SingletonExample3 {
    // 声明变量
    public static volatile SingletonExample3 instance = null;

    // 私有化构造函数
    private SingletonExample3(){

    }
    // 提供对外方法
    public static SingletonExample3 getInstance(){
        if (instance == null){
            synchronized (SingletonExample3.class){
                if (instance == null){
                    instance = new SingletonExample3();
                }
            }
        }
        return instance;
    }
}
