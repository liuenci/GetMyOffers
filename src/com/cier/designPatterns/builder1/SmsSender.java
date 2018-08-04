package com.cier.designPatterns.builder1;


public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
