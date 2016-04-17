package com.pattern.FactoryMethod.demo2;

import com.pattern.FactoryMethod.demo1.Sender;

public class FactoryTest {  

    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
}  