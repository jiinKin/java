package com.min.edu;

import java.util.Iterator;

public class Diamond_Seperate {

	static int n = 4;
	
	// 층수만을 입력해주는 메소드
	public static void  stageInput() {
		for (int i = 0; i <n; i++) {
			drawImg(i);
		}
		for (int i = n; i > 0; i--) {
			drawImg(i);
		}
	}
	
	// 그림만 그려주는 메소드
	public static void drawImg(int i) {
		for (int j = 0; j < n-i; j++) {
			System.out.print("○");
		}
		for (int j = 0; j < (2*i)-1; j++) {
			System.out.print("●");
		}
		System.out.println();
	}
	
}
