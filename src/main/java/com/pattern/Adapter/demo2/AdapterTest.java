package com.pattern.Adapter.demo2;

import com.pattern.Adapter.demo1.Source;
import com.pattern.Adapter.demo1.Targetable;

public class AdapterTest {  
  
    public static void main(String[] args) {  
        Source source = new Source();  
        Targetable target = new Wrapper(source);  
        target.method1();  
        target.method2();  
    }  
}