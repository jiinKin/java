package com.min.edu;

public class ChildClass {

	private int x;
	private int y;
	
	//default  생성자
	// class를 작성하면 기본으로 암묵적으로 가지고 있는 반환이 없는 메소드 
	public ChildClass() {
		super();
	}

	//생성자 overloading 
	// 멤버필드의 초기값을 입력하기 위한 arguments 2개를 입력 받는 생성자
	public ChildClass(int x, int y) {
		super(); // 자식이 생성되려면 부모가 먼저 생성되어야 한다
		this.x = x;
		this.y = y;
	}

	// 생성자 overloading 1개의 arguments
	public ChildClass(int x) {
		super();
		this.x = x;
		this.y = x;
	}
	
	
	
	
	
}





