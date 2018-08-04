package com.cier.designPatterns.builder1;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    public List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++){
            list.add(new SmsSender());
        }
    }
}
