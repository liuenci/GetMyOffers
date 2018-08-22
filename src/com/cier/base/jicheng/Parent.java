package com.cier.base.jicheng;

public class Parent {
    Parent() {
        System.out.println("调用父类构造方法!");
    }

    private static void staticParent() {
        System.out.println("调用父类静态方法");
    }

    private final void finalParent() {
        System.out.println("调用父类final方法");
    }

    private void printParent() {
        System.out.println("调用父类私有方法");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("调用子类公有方法");
    }
}