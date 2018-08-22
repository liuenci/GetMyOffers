package com.cier.base.sta;

public class OuterClass {
    private static float f = 1.0f;

    public static class InnerClass{
        protected static float func(){
            return f;
        }
    }
}
