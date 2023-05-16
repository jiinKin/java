package com.min.edu;
/**
 * Abstract 클래스로 각 면적을 계산하는 자식클래스들이 extends 하여<br>
 * 멤버필드를 통해서 필요한 x, y값을 입력받고<br>
 * 결과를 담을 수 있는 멤버필드를 가지고 있는 클래스<br>
 * 공통 기능은 print() 구현
 */
public abstract class AreaImpl implements IArea {

	/**
	 * 자식 클래스에서 사용하는 공통 변수 x
	 */
	protected int x;
	/**
	 * 자식 클래스에서 사용하는 공통 변수 y
	 */
	protected int y;
	/**
	 * 자식 클래스에서 cal()을 통해 연산된 결과를 담는 변수 result
	 */
	protected double result ;
	
	
	public AreaImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 각 면적으로 계산하는 자식의 클래스에게 구현을 강요한다<br>
	 * <b>interface -&gt; class -&gt; abstract 메소드 -&gt; 자식이 구현</b>
	 */
	@Override
	public abstract void cal() ;

	/**
	 * 면적의 결과를 출력하는 공통 메소드
	 */
	@Override
	public void print() {
		System.out.printf("%d와 %d의 계산된 면적의 결과는 %f\n", x, y, result);
	}

}
