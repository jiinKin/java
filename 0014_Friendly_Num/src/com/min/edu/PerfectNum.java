package com.min.edu;

import java.util.Iterator;

// TODO 002 완전수 
// 진약수 합이 자신의 숫자가 되는 것
// 6 => 1+2+3 =6
public class PerfectNum {
	
	//1) 두개의 정수를 입력 받아 진약수를 판단하는 메소드
	private boolean isCheck(int num, int chNum) {
		boolean isc = false;
		if(num%chNum ==0) {
			isc= true;
		}
		return isc;
	}
	//2) 1)을 사용하여 약수로 판단되면(true) 그 값을 누적하는 메소드
	
	private int yaksuSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(isCheck(num, i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	//3) n까지의 범위를 가지면서, 2)를 사용하여 비교한후 같다라면 완전수를 출력해주는 메소드
	public void perfectNum(int area) {
		for (int i = 4; i <= area; i++) {
			if(i == yaksuSum(i)) {
				System.out.printf("%d 완전수로 판단됨\n", i);
			}
		}
	}
	
}









