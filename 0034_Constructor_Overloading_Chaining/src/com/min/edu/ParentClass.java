package com.min.edu;

// 생성자의 Chaining 
/*
 * this 키워드를 사요앟여 생성자에서 같은 클래스의 오버로딩된 생성자를 호출 할 수 있습니다
 * 생성자 체이닝이란?
 * 생성자의 활용을 통해서 더 많은 코드를 재사용할 수 있다 
 */

/*
 * 생성자 체이닝 사용시 주의점
 */
public class ParentClass {

	// default 생성자
	public ParentClass() {
//		super();
		this("안녕");
	}

	public ParentClass(String string) {
		super();
		System.out.println("부모의 생성자 : "+string);
	}
	
	
	
}






