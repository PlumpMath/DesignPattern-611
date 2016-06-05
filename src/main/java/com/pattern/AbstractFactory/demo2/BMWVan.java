package com.pattern.AbstractFactory.demo2;

public class BMWVan extends AbsBMW {

	private final static String SEVENT_SEARIE ="7系列车型商务车";
	
	@Override
	public String getModel() {
		return SEVENT_SEARIE;
	}

}
