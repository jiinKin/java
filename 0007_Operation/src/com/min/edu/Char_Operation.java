package com.min.edu;

public class Char_Operation {

	// char는 3개의 리터럴 
	// 기본 표현값, Unicode 값, 정수(int) 값
	
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		System.out.println();
		System.out.print("코코아");
		System.out.print("맛있다");
		// formatting 방식, %s문자, %d숫자, %f실수 값을 binding한다
		System.out.printf("%s와 %s를 %d배 맛있다%n","커피","복숭아티",2);
		//java Escape 문자표 = HTML Entity tag 표
		System.out.println("\"코코아\" \t엄청 맛있다.\n '복숭아티' 섞을 2배 맛있다");
		
		System.out.println(c1); // 기본값
		System.out.println(c2); // int
		String s = Integer.toHexString(65);
		System.out.println(s);
		char c3 = '\u0041';
		System.out.println(c3);
		
		
		//TODO 001 Casting과 Promotion
		// Casting은 특정 형태로 강제로 변경하는 작업을 말합니다
		// ex) double d = 3.11; int i = (int)d;
		// Promotion은 캐스팅 연산자를 사용하지 않고 변경되는 작업을 말합니다
		// ex) int a =10; long l =a;
		int idxA = 65;
		char c4 = (char)idxA;
		System.out.println(c4);
		int c5 = c4;
		
		char c6 = (char) (c4 +1);
		System.out.println(c6);
		
		int c7 = 'a'-0;
	}
}
