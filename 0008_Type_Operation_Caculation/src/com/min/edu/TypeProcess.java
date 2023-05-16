package com.min.edu;

public class TypeProcess {

	// 멤버필드란?
	// 접근제한자를 가지고 있는 변수, 선언하면 자동으로 default 초기화
	// new를 통해서 사용해야함
	
	public void calculation() {
		byte b1 = 127;
		byte b2 = 1;
		// 정수형의 연산은  int연산 단, long 제외
		int bSum = b1+b2;
		// casting연산자는 int의 크기에서 8bit을 제거 하기 때문에
		// 연산된 10000000을 byte로 처리 하면 1은 부호비트로 되기때문에
		// 결과는 음수인 -128이 된다
		byte bSumB = (byte)(b1+b2);
		System.out.println(bSumB);
		int iConvert = bSumB;
		System.out.println(iConvert);
		
		
		float f = 10.0f;
		// 나누기 연산시 casting연산자를 잘 사용하세요
		float fDiv = f/2;
//		float dDiv = 10/2.0; // 참여하는 2.0의 값은 dobule 리터럴
//		float dDiv = 10f/2.0; 
		float dDiv = (float)(10f/2.0); 
	
		float iDiv = 10/3;
		float iDivT = (float)(10/3);
	}
	
	public void floatValueConfirm() {
		// 부동소수점
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
	
}
