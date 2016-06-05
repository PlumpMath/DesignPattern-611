package com.pattern.ChainOfResponsibility.demo2;

public class ConcreteFilter3 implements Filter {

	@Override
	public String doFilter(String str,Filter filter) {
		System.out.println("ConcreteFilter3");
		return filter.doFilter(str.substring(2), filter);
	}

}
