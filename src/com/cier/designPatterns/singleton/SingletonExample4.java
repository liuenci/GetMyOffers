package com.cier.designPatterns.singleton;

/**
 * 静态内部类的懒汉式
 * 既实现了线程安全，又避免了同步带来的性能影响
 */
public class SingletonExample4 {
    private static class LazyHolder{
        private static final SingletonExample4 instance = new SingletonExample4();
    }
    private SingletonExample4(){

    }
    public static final SingletonExample4 getInstace(){
        return LazyHolder.instance;
    }
}
