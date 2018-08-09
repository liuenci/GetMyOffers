package com.cier.designPatterns.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable decorator = new Decorator(sourceable);
        decorator.method();
    }
}
