package com.pattern.ChainOfResponsibility.demo2;

public class test {

	public static void main(String[] args) {
		FilterChain chain = new FilterChain();
		ConcreteFilter1 filter1 = new ConcreteFilter1();
		ConcreteFilter2 filter2 = new ConcreteFilter2();
		ConcreteFilter3 filter3 = new ConcreteFilter3();
		
		chain.addFilter(filter1);
		chain.addFilter(filter2);
		chain.addFilter(filter3);
		
		String str = chain.doFilter("aabbccdd", chain);
		System.out.println(str);
	}
}
