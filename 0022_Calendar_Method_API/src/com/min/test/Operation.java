package com.min.test;

public class Operation {

	public void op() {
		int n =0;
		// 값이 아니고 값을 반환하는 것도 가능
		boolean isc1 = (n== 0)?a():b();
		// c()의 반환타입이 다르기 때문에
		Object str = (n== 0)?a():c(); // 반환타입이 다르지만 담는 변수가  Object때문에 정상동작
				
		//  리턴은 반드시 반환이 있어야 하기 때문에 void로 되어 있는 메소듣 호출 할 수 없음
		// ☞ 문법적 오류 이다
//		boolean isc3 = (n== 0)?a():v();
	}	
	public void v() {
		
	}
	
	public boolean a() {
		return true;
	}
	
	public boolean b() {
		return false;
	}
	
	public String c() {
		return "a";
	}
	
}







