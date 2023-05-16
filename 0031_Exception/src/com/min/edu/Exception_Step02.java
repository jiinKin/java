package com.min.edu;

import java.util.Scanner;

public class Exception_Step02 {

	// 분모값이 0이면 발생되는 예외 클래스 : java.lang.ArithmeticException: / by zero
	// 정수가 아닌 값을 입력면 발생되는 예외 클래스 : java.util.InputMismatchException
	
	public int calculation() {
		int n = 0;
		// 예외발생 가능 영역을 try~catch로 작성
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수를 입력해 주세요");
			n = scan.nextInt() / scan.nextInt(); // 예외 발생 가능 코드
			System.out.println("연산결과 : " + n);
		} catch (Throwable e) { // 예외처리 계층구조에서 Runtime의 상위 클래스  VMI
			e.printStackTrace();
		}
		return n;
	}
	
}





