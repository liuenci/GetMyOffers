package com.cier.designPatterns.singleton;

/**
 * 加上同步锁的懒汉式，实现线程安全
 */
public class SingletonExample5 {
    private static SingletonExample5 instance = null;

    private SingletonExample5(){

    }

    public static synchronized SingletonExample5 getInstance(){
        if (instance == null) {
            instance = new SingletonExample5();
        }
        return instance;
    }
}
