package com.cier.designPatterns.factory4;

public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
