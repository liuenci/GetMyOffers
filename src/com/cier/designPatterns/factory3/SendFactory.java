package com.cier.designPatterns.factory3;

import com.cier.designPatterns.factory1.MailSender;
import com.cier.designPatterns.factory1.Sender;
import com.cier.designPatterns.factory1.SmsSender;

public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
