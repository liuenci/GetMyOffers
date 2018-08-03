package com.cier.designPatterns.factory1;

/**
 * 普通工厂方法
 */
public class SendFactory {

    public Sender product(String type){
        if ("mail".equals(type)){
            return new MailSender();
        } else if ("sms".equals(type)){
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
