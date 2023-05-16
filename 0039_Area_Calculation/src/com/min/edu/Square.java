package com.min.edu;

/**
 * 사각형 면적을 계산하는 클래스
 */
public class Square extends AreaImpl {

	public Square(int x, int y) {
		super(x, y);
	}

	@Override
	public void cal() {
		result = x *y;
	}

}
