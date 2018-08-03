package com.cier.designPatterns.factory4;

public class SendMailFactory implements Provider{


    @Override
    public Sender produce() {
        return new MailSender();
    }
}
