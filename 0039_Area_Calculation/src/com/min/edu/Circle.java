package com.min.edu;

/**
 * 원형 면적을 계산하는 클래스
 */
public class Circle extends AreaImpl {

	public Circle(int x, int y) {
		super(x, y);
	}

	@Override
	public void cal() {
		result = x * y * PI;
	}

}
