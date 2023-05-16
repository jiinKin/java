package com.min.edu;

import java.util.Arrays;

// FinalClass가 extends 가능한 클래스이다. 
// 만약에 FinalClass가 final로 작성되어 있다면 extends 문법 오류가 발생
public class ChildClass extends FinalClass {

	public ChildClass() {
		parentUserMethod();
	}
	
	
	public void parentUserMethod() {
//		ARR = null;// final 재입력 불가
//		AGE = 100;// final 재입력 불가
//		change();
		
		ARR[0] = 100;
		int[] copyARR = getArr();
		copyARR[0] = 999;
		
		System.out.println("원본 : " + Arrays.toString(ARR));
		System.out.println("복사본: " + Arrays.toString(copyARR));
	}


//	@Override
//	public String callMethod() {
//		return "난 자식메소드이다";
//	}
	
	
	
}
