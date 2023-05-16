package com.min.edu;

import java.util.Iterator;

/*
 * TODO 003  친화수
 *  220 -> 진약수 합 284
 *  284 -> 진약수 합 220
 */
public class FriendlyNum {

//1) 약수여부를 판단하는 메소드
	// true 약수다
	public boolean isCheck(int num, int ch) {
		boolean isc =false;
		if(num % ch ==0) {
			isc =true;
		}
		return isc;
	}
//2) 진약수의 합을 반환하는 메소드
	public int sum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(isCheck(num, i)) {
				sum += i;
			}
		}
		return sum;
		
	}
//3) 친화수를 판단하는 메소드
	
	public void firentdlyProcess(int area) {
		for (int i = 2; i <= area; i++) {
//			for (int j = 2; j <= area; j++) {
				/*
				 *  220 ->284
				 *  284 -> 220
				 */
//				if( i!=j && i<j && i == sum(j) && j == sum(i)) {
//					System.out.printf("%d와 %d는 친화수 입니다\n", i, j);
//				}
				
				int a = i; // 220
				int b = sum(a); //284
				int c = sum(b ); // 220
				
				if(a<b&& a!=b && a==c) {
					System.out.printf("%d 와 %d는 친화수 입니다\n", a, b);
				}
				
				
//			}
		} 
	}
}












