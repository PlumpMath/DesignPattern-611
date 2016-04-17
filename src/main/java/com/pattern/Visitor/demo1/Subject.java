package com.pattern.Visitor.demo1;
public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}