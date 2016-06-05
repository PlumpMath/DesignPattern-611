package com.pattern.ChainOfResponsibility.demo2;

public interface Filter {

	String doFilter(String str,Filter filter);
}
