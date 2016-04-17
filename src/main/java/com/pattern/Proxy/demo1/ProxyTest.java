package com.pattern.Proxy.demo1;
public class ProxyTest {  

    public static void main(String[] args) {  
        Sourceable source = new Proxy();  
        source.method();  
    }  

}  