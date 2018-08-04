package com.cier.designPatterns.builder2;

public class BuilderExample {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new CreateBuilder();
        director.construct(builder);
        Computer computer = builder.getComputer();
        computer.show();
    }
}
