package com.min.edu.type;

import java.util.ArrayList;

public class Data_Type {

	//TODO 001 선언과 대입
	public void declaring_assignment() {
		int val; // 사용되는 타입의 변수명 선언(declaring)
		val =10; // 선언된 변수에 값을 대입(assignment)
		
		int newVal = 10; // 선언되 대입을 동시에 할 수 있다
		System.out.println("선언된 변수명을 호출하면 입력된 값을 가져온다" + val);
	}
	
	//TODO 002 java의 기본 타입의 종류
	public void dataTypeKind() {
		// 정수형 byte, short, int, long
		// 실수형 float, dobule
		// 문자형 char
		// 논리형 boolean 
	}
	
	//TODO 003 정수 타입
	public void integerType() {
		byte b = 2; //-128 ~ 127
		short s = 1; //-32768 ~ 32767
		int i =0; //
		long l = 10; //
		
		//리터럴 표기법
		int hex = 0xF; //hexadecimal 16
		int oct = 07; // octal
		int bi = 0b01; // binary (1.7 부터 사용되는 2진수 표기법)
		
		int bicNumber = 1_000_000;
	}
	
	//TODO 004 실수타입
	public void floatType() {
		double d = 3.14;
		double d2 = 3e2; //지수표기법 10^2

		//java에서의 실수는 항상 값을 double 를 가짐
		//따라서 float타입을 선언하여 값을 입력 경우는 리터럴 처리를 해줘야한다
		//접미어 f, F
		float f = 0.11F;
		double d3 = 3.11;
		float fC = (float)d3; // 캐스팅(casting)연산자
		
	}
	
	//TODO 005 문자형(Unicode Charchter)
	public void charType() {
		//문자형의 선언은 '(single quote)를 통해서 값을 선언한다
		char a = 'A';
		//모든 문자형은 unicode 표현식인 16진수로 입력이 가능한다
		char aa = '\u0000'; // 리터럴
		char aaa = 65;
		
	}
	
	//TODO 006 논리형 (java에서는 true/false의 예약어로만 사용할 수 있다)
	public void booleanType() {
		boolean isc1 = true;
//		boolean isc2 = true+1; // 따라서 다른 언어와 다르게 논리값과 연산이 되지 않는다
		
		//## & , &&
		System.out.println(3&1);
		System.out.println(true&&true);
		System.out.println(true&true);
	}
	
	//TODO 007 var타입
	// java 10 로컬변수는  var로 선언하여 컴파일러가 할당에 따라서 
	// 변수 유형을 자동으로 결정하도록 하는 것입니다
	// 1) var타입은 local variable에서만 가능하다
	public void varType() {
		// 다음 두 선언은 동일합니다
		var i1 = "한글";
		int i2 = 5;
		System.out.println(i1);
		System.out.println(i2);
		
		// 할당된 변수의 유형이 분명한경우 선언을 줄이고
		// 가독성을 높이기 위하여 var를 사용한 는 것이 좋음
		
		ArrayList lists = new ArrayList();
		
		var l = new ArrayList();
		
	}
	
}




