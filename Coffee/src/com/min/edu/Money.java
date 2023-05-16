package com.min.edu;

import java.util.Scanner;

//잔돈 계산해주는 클래스
public class Money {

	public int change(int t) {
		System.out.println("돈을 투입해주세요");
		int result = 0;
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		result=x-t;
		System.out.println("잔돈은 "+result+"원입니다");

		return result;

	}
}