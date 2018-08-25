package com.cier.base.sta;

public class TestClass {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((TestClass)null).testMethod();
        String s = null;
        System.out.println(s.length());
    }
}
