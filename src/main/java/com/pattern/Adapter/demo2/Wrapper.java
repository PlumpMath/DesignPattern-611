package com.pattern.Adapter.demo2;

import com.pattern.Adapter.demo1.Source;
import com.pattern.Adapter.demo1.Targetable;

/**
 * 对象的适配器模式<br/>
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 * 
 * @author sunxuechao
 */
public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

	@Override
	public void method1() {
		source.method1();
	}
}