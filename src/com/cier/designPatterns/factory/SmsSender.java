package com.cier.designPatterns.factory;

public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("this is sms sender");
    }
}
