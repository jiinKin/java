package com.min.edu;

public class Pattern_Matching_Switch {

	/*
	 * java17미리보기 java20미리보기  기능으로 switch문 및 표현식에 대한 패턴 일치가 추가 되었습니다
	 * 비교는 숫자, 문자,  문자열거형 유형(Enum)의 타입만 대상이 됩니다
	 * 
	 * 동일한 패턴의 타입이라면 판단을 결정되도록 만듬
	 *  
	 *  Long 타입과 일치하면 실행되는 코드를 작성해보겠습니다
	 */
	
	public void pattern_Check() {
		Object obj = 5L;
		String myType = switch(obj) {
			case null -> "null";
			case Integer i -> "정수(Integer)의 값입니다"  + i;
			case Iong l -> "정수(long)의 값입니다"  + l;
			default -> obj.toString();
		}
	}
	
}





