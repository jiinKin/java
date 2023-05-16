package com.min.edu;

/**
 * 삼각형 면적을 계산하는 클래스
 */
public class Triangle extends AreaImpl {

	
	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	public void cal() {
		super.result = super.x* super.y * 0.5;
	}

}
