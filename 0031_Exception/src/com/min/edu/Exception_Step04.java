package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Step04 {

	// 분모값이 0이면 발생되는 예외 클래스 : java.lang.ArithmeticException: / by zero
	// 정수가 아닌 값을 입력면 발생되는 예외 클래스 : java.util.InputMismatchException
	
	// Multi_Catch block
	// 예외 발생 코드를 구체화 시켜서 작성
	// 예외가 여러개 발생되는 코드를 여러개의 catch block를 통해서 작성
	// Exception -> ArithmeticException , InputMismatchException
	// 계층구조 
	public int calculation() {
		int n = 0;
				try {
					Scanner scan = new Scanner(System.in);
					System.out.println("정수를 입력해 주세요");
					n = scan.nextInt() / scan.nextInt();
					System.out.println("연산결과 : " + n);
				} catch (ArithmeticException | InputMismatchException e) {
					// 기존의 multi~catch block은 상위 하위의 계층을 통해 처리 가능했음
					// 업데이트 된(1.7) multi~catch block은 동등 계층에서만 처리 가능함
					e.printStackTrace();
				}
		return n;
	}
	
}





