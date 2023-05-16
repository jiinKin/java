package com.pack.age.two;

import com.pack.age.one.TestAccessClass;

public class Child extends TestAccessClass{

	//TODO004 extends를 통해서 
	// protected는 자식클래스에서 패키지가 달라도 사용이 가능한 멤버이다
	public void checkExtends() {
		protectedMethod();
		publicMethod();
		
	}
}
