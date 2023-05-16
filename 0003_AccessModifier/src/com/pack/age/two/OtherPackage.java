package com.pack.age.two;

import com.pack.age.one.TestAccessClass;

//TODO 007 외부 + 다른 패키지에서 객체를 생성하여 호출
public class OtherPackage /* extends Object */{

	/**
	 * TODO TEST003 외부의 다른 패키지에서 객체를 생성하여 
	 *      사용할 수 있는 접근제한자를 확인
	 */
	public void other() {
		TestAccessClass tac = new TestAccessClass();
		tac.publicMethod();
		// protected는 extends하지 않고 new로 사용한다면
		// default와 같이 외부 패키지에서는 사용불가 하다
	}
}









