package com.min.edu.word; //첫번째, 패키지, 소문자, 클래스의 물리적인 위치

import java.util.Date;// import 외부패키지의 클래스를 사용시 어떠한 곳의 클래스를 사용하지 명시적으로 나타냄
					  // java.lang 패키지의 클래스는 암묵적인 import
					  // java.util.* 의 문법은 *(wild card) java.util에 모든 클래스는 import 하겠다

public class DTO { // 접근제어자 / 클래스 / 클래스명 / {code block} : block안에는 멤버(member)라 한다

	// 멤버필드 영역// : 접근제한자 / 타입 , 
	             //   선언만 하여도 자동으로 default 값으로 초기화된다 , heap 
	public String name; // instance,class 변수 외부에서 클래스를 new 했을 경우 사용할 수 있는 변수 
	public static String hobby; // static 변수 클래명.멤버로 사용할 수 있다, 클래스명만 사용한다면 접근 및 수정이 가능
								// 단 한번 생성된다
	//----------//
	
	//생성자(constructor)// : 클래스를 만들면 자동으로 생성되는 반환타입이 없는 메소드
						// : 클래스명과 메소드명이 같습니다
	                    // : 외부에서 new를 생성자를 호출하고 객체를 메모리 할당하는 역할
	public DTO() {
	}
	//-----------------//
	
	//멤버메소드 영역// : 접근제한자 / [static] / [final] / 반환타입 / 메소드명([arguments parameter])
	public void make(int n) { // arguments 외부에서 넣어줘야 할 값 , parameter는 메서드 내부에서 값을 호출할 이름
		int a = n; // local variable 메소드내부에서 사용하고 사라지는 변수
		new Date(); // 다른 패키지에 있는 클래스를 생성한. 외부이기 때문에 import되어야한다
		new java.sql.Date(2023); // 먼저 import된 같은 클래스가 있다면, 소스파일 내부에 명시적으로 package가 작성된다
		System.out.println();
	}
	//-----------//
}
