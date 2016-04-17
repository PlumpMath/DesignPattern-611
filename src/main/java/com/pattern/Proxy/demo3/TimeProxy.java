package com.pattern.Proxy.demo3;
import java.lang.reflect.Method;
public class TimeProxy implements Moveable{
	InvocationHandler h;
	public TimeProxy(InvocationHandler handler)
	{ h = handler;}
	@Override
	public void move(){
		try{
			Method md = Moveable.class.getMethod("move");
			h.invoke(this,md);
		}catch(Throwable e)
		{	
			e.printStackTrace();
		}
	}
}