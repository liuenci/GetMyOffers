package com.cier.designPatterns.factory3;

import com.cier.designPatterns.factory1.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
