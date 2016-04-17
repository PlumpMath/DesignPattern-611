package com.pattern.FactoryMethod.demo3;

import com.pattern.FactoryMethod.demo1.Sender;

public class FactoryTest {  
  
    public static void main(String[] args) {      
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
    }  
} 