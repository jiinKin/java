package com.min.three;

import java.util.Scanner;

public class InputScan {

	public static int intputKeyBoard() {
		int n = 0;
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수값을 입력해주세요");
			try {
				n = scan.nextInt();  // keyboard에서 입력받은 값이 문자형 숫자가 아니라면 예외
				if(n>=0 && n<=10) {
					break;
				}
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("잘못된 입력 값입니다. 정수넣어 주세요");
			}
		}
		return n;
	}
	
}
