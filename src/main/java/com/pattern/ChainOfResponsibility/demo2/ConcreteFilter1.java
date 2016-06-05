package com.pattern.ChainOfResponsibility.demo2;

public class ConcreteFilter1 implements Filter {

	@Override
	public String doFilter(String str,Filter filter) {
		System.out.println("ConcreteFilter1");
		return filter.doFilter(str.substring(2), filter);
	}

}
