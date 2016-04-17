package com.pattern.FactoryMethod.demo3;

import com.pattern.FactoryMethod.demo1.MailSender;
import com.pattern.FactoryMethod.demo1.Sender;
import com.pattern.FactoryMethod.demo1.SmsSender;

public class SendFactory {  
      
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
} 