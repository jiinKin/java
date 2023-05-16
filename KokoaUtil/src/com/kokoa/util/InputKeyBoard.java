package com.kokoa.util;

import java.util.Scanner;

/**
 * 수업에서 사용할 키보드에서 입력받는 값을 처리해 주는 유틸리티 클래스
 * @author JMK
 * @since 2023.04.21
 * @version 1.0
 *
 */
public class InputKeyBoard {

	/**
	 * 키보드를 통해서 정수의 값을 반환받아 반환하는 메소드
	 * @return 키보드로 입력된 정수 int
	 */
	public static int intputInteger() {
		int m = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값을 입력해주세요");
		m =scan.nextInt();
		return m;
	}
	
}
