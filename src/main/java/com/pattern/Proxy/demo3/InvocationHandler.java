package com.pattern.Proxy.demo3;

import java.lang.reflect.Method;

public interface InvocationHandler {

	public void invoke(Object o, Method m);
}
