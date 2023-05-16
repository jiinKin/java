package com.min.edu;

// TODO 001 for
public class For {

	// for란? Iterator임
	// 코드블럭을 특정 횟수 많큼 실행 시킴
	// 세가지의 선언, 판단, 연산을 사용함
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if((i+1)%2 ==0) {
				sum = sum+(i+1);
			}
		}
		System.out.println(sum);
		
		For_Fn fn = new For_Fn();
//		fn.make();
//		fn.make_two();
		fn.make_three();
		
	} //main
	
}
