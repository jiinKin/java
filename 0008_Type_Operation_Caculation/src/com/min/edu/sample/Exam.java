package com.min.edu.sample;

public class Exam {

	// char숫자 ->  int숫자
	//  '9' -> 9, '0'->0
	public void charnumToNum() {
		char n = '9';
		int nToI = n;
		System.out.println(nToI);
		int result =  n -48;
		System.out.println(result);
		
		char z = 48;
		System.out.println(z);
		
		int cal = n - '0';
		System.out.println(cal);
		
		int cal2 = '0'-n;
		System.out.println(Math.abs(cal2));
	}
	
	
	// 'A'-> 'Z'
	public void charToChar() {
		char A = 'A';
		char Z = 'Z';
		System.out.printf("A의 정수값: %d / Z의 정수값: %d\n",(int)A,(int)Z);
		A = (char)(A + Math.abs(A-Z));
		System.out.println("변경된 A의 값:" + A);
	}
	
	// 123번에 있는   Unicode의 값을 출력하세요 
	public void charIndex() {
		char con = 123;
		System.out.println(con);
	}
}




