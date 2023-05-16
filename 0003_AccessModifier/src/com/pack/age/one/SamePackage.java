package com.pack.age.one;

//TODO 006 외부에서 객체를 생성한 후에 접근제한자를 확인
public class SamePackage {

	/**
	 * TODO TEST002  같은패키지에서 TestAccessClass를 new해서 
	 * 하위에 있는 멤버 메소드를 호출해 본다
	*/
	public void samePackageAccess() {
		// 타입    /객체명  / 대입연산자/  new예약어  / TextAccessClass의 생성자 
		TestAccessClass tc    =       new      TestAccessClass();
		tc.publicMethod();
		tc.defautMethod();
		tc.protectedMethod();
		// private으로 선언된 멤버는 객체를 생성해도 호출되지 않아요
	}
}






