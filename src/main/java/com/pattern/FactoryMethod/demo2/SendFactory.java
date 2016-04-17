package com.pattern.FactoryMethod.demo2;

import com.pattern.FactoryMethod.demo1.MailSender;
import com.pattern.FactoryMethod.demo1.Sender;
import com.pattern.FactoryMethod.demo1.SmsSender;

public class SendFactory {  
      
    public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}  