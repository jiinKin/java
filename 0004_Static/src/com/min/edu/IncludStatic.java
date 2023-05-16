package com.min.edu;

public class IncludStatic {

	private static int num =10;
	
	public void make() {
		System.out.println("일반 메소드 make");
		//TODO TEST001 같은클래스의 static 멤버를 호출해 보자
		// 호출되지 된다
		staticPrint();
		System.out.println(Math.PI);
	}
	
	public void print() {
		System.out.println("일반 메소드 print");
	}
	
	public static void staticPrint() {
		//TODO TEST002 static에서 non-static을 호출 하는 방법
		// 호출되지 않음 
		// 하지만 new를 통해 메모리에 할당한다면 호출 할 수 있다
		IncludStatic is = new IncludStatic();
		is.make();
		System.out.println("static 메소드 staticPrint");
		System.out.println(num);
	}
}




