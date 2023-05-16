package com.min.edu;

import java.util.Scanner;

/**
 * 키보드에서 입력받는 값을 처리해 주는 유틸리티 클래스
 * @author HA,KH
 */
public class InputKeyBoard {

	/**
	 * 키보드를 통해서 정수의 값을 반환받아 반환하는 메소드
	 * 
	 * @return 키보드로 입력된 정수 int
	 */
	public static int inputInteger() {
		int m = 0;
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		return m;
	}

}
