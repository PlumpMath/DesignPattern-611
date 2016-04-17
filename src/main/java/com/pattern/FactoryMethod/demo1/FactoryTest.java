package com.pattern.FactoryMethod.demo1;
public class FactoryTest {  

    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();  
    }  
}  