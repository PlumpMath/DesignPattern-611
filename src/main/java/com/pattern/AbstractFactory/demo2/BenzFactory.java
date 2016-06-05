package com.pattern.AbstractFactory.demo2;

public class BenzFactory implements ICarFactory{

	@Override
	public ICar createSuv() {
		return new BenzSuv();
	}

	@Override
	public ICar createVan() {
		return new BenzVan();
	}

}
