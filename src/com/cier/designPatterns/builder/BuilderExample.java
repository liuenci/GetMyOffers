package com.cier.designPatterns.builder;

public class BuilderExample {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceSmsSender(10);

    }
}
