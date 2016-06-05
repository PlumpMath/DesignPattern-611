package com.pattern.AbstractFactory.demo2;

public interface ICarFactory {

	//生产SUV
	public ICar createSuv();
	//生产商务车
	public ICar createVan();
}
