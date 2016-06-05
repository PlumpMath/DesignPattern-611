package com.pattern.AbstractFactory.demo2;

public abstract class AbsBMW implements ICar {

	private final static String BWN_BAND="宝马汽车";
	
	@Override
	public String getBand() {
		return BWN_BAND;
	}

	@Override
	public abstract String getModel();
	

}
