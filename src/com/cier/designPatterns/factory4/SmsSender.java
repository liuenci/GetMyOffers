package com.cier.designPatterns.factory4;

public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
