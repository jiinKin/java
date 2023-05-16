package com.min.edu;

import java.util.Iterator;

public class If {

	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum  = 0;
		int cnt = 0; //반복의 횟수 
		
		for (int i = 0; i < 10; i++) { // 반복횟수 /0~9 => 10회
			if((i+1) % 2 == 0) { // 짝수라면
				evenSum = evenSum+(i+1);
			}
			else if((i+1) % 2 == 1) {
				
			}
//			else { // 홀수라면
//				oddSum = oddSum+(i+1);
//			}
			cnt++;
		} //for문
		System.out.printf("짝수합 %d, 홀수합 %d \n", evenSum, oddSum);
		System.out.println("총 반복횟수 : "+ cnt);
		
		
		If_Fn f = new If_Fn();
		f.groupNum();
		
		System.out.println("메인출력 : " + f.aG);
		System.out.println("메인출력 : "+ f.bG);
		System.out.println("메인출력 : "+ f.cG);
		
	}//main
}
