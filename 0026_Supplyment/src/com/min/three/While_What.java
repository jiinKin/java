package com.min.three;

public class While_What {

	public static void main(String[] args) {
		
		InputScan.intputKeyBoard();
		
		
		
		// 반복문
		// 1) for : 초기값, 조건, 연산, 증감이 있는 범위 반복문
		// 2) while :  무한반복, 특정한 조건을 만족할때 종료 하게 됨
		
		// 시나리오 : ramdom 1~10까지으로 숫자를 판단. 4가 될때 종료
		int cnt =0;
		for ( int i = 0 ;i < 100; i++) {
			int num = (int)(Math.random()*10)+1;
			if(num == 4) {
				cnt = i;
				break;
			}
		} //for문
		System.out.println(cnt);
		
		
		int cntw = 0;
		while (true) { // 무한루프
			cntw++;
			int num = (int)(Math.random()*10)+1;
			if(num == 4) {
				break;
			}
		}
		System.out.println(cntw);
		
	}

}
