package com.pack.age.one;

public class Child extends TestAccessClass {

	//TODO004 extends를 통해서 부모의 기능을 확장하여 사용한다
	// protected는 자식클래스가 사용할 수 있음으로 표시한다 
	public Child() {
		publicMethod();
		protectedMethod();
		defautMethod();
	}
	
}
