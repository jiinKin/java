package com.pack.age.one;

//TODO 001 모든 접근제한자를 가지고 있는 테스트 클래스
public class TestAccessClass {

	//TODO TEST001 같은 클래스의 메소드에서 접근제한자 확인하기
	private void test001() {
		publicMethod();
		protectedMethod();
		privateMethod();
		defautMethod();
	}
	
	//TODO 002 public 메소드
	public void publicMethod() {
		System.out.println("난 퍼블릭이다");
	}
	//TODO 003 (default)메소드
	void defautMethod() {
		System.out.println("난 디폴드이다");
	}
	//TODO 004 protected 메소드
	protected void protectedMethod() {
		System.out.println("난 프로텍티드이다");
	}
	//TODO 005 private 메소드
	private void privateMethod() {
		System.out.println("난 프라잇이다");
	}
	
}





