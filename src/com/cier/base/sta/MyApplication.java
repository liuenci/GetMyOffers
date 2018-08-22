package com.cier.base.sta;

public class MyApplication {
    public static void main(String[] args) {
        Test test = null;
        test.hello();
    }


}
class Test{
    public static void hello(){
        System.out.println("hello");
    }
}