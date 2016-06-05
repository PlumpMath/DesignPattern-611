package com.pattern.AbstractFactory.demo2;

public class BMWFactory implements ICarFactory {

	@Override
	public ICar createSuv() {
		return new BMWSuv();
	}

	@Override
	public ICar createVan() {
		return new BMWVan();
	}

}
