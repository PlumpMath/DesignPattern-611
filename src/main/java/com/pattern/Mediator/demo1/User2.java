package com.pattern.Mediator.demo1;
public class User2 extends User {

	public User2(Mediator mediator){
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user2 exe!");
	}
}