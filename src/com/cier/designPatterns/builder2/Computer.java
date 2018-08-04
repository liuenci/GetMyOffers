package com.cier.designPatterns.builder2;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    // 电脑组件的集合
    private List<String> parts = new ArrayList<>();

    /**
     * 用于将组件组装到电脑里
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * 用于展示已装配组件
     */
    public void show(){
        for (int i = 0; i < parts.size(); i++){
            System.out.println("组件"+parts.get(i)+"装好了");
        }
        System.out.println("电脑组装完成");
    }
}
