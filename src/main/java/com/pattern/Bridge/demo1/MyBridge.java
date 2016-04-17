package com.pattern.Bridge.demo1;
public class MyBridge extends Bridge {  
    public void method(){  
        getSource().method();  
    }  
}