package com.pattern.Builder.demo2;

public class BenzBuilder extends CarBuilder {
	public String buildEngine() {
		return super.getBlueprint().getEngine();
	}

	public String buildWheel() {
		return super.getBlueprint().getWheel();
	}
}