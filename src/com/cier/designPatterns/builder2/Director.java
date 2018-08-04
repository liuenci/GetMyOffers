package com.cier.designPatterns.builder2;

public class Director {
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildHD();
    }
}
