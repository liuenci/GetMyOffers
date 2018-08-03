package com.cier.designPatterns.factory2;

import com.cier.designPatterns.factory1.MailSender;
import com.cier.designPatterns.factory1.Sender;
import com.cier.designPatterns.factory1.SmsSender;

/**
 * 多个工厂方法模式
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
