package com.cier.base.jicheng;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //获取子类
        Class clazz = Class.forName("com.cier.base.jicheng.Child");
        //得到父类
        Class superClass = clazz.getSuperclass();
        //得到父类非继承的所以方法
        Method[] methods = superClass.getDeclaredMethods();
        //设置私有方法可以被访问
        AccessibleObject.setAccessible(methods, true);
        for (Method m : methods) {
            System.out.println();
            System.out.println("子类调用方法" + m.getName() + "()的调用结果:");
            m.invoke(new Child());
        }

    }
}
