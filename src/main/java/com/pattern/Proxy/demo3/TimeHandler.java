package com.pattern.Proxy.demo3;

import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object o, Method m) {
		try {
			long start = System.currentTimeMillis();
			
			m.invoke(target);
			
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
