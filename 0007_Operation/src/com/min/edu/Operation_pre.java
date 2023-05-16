package com.min.edu;

// 연산자 우선순위
public class Operation_pre {
	// 1. ++ -- ! ~
	// 2. * / %
	// 3. + - 
	// 12. =
	
	// 연산순위 중에서 최우선은 우선순위는 ()
	public void opertaion() {
		boolean isc1 = 2+3 > 1*4 && 5/5 ==1; 
		boolean isc2 = ((2+3) > (1*4) )&&( (5/5) ==1); 
		System.out.println(isc1);
		System.out.println(isc2);
	}
}
