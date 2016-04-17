package com.pattern.Proxy.demo3;

public class Client {

	public static void main(String[] args) {
		Tank tank = new Tank();// 被代理对象
		InvocationHandler handler = new TimeHandler(tank);// 代理处理逻辑

		Proxy.newProxyInstance(Moveable.class, handler);
	}
}
