package com.min.edu;

public class Triangle {

	public void triangle_One() {
		
	}
	public void triangle_Two() {
		
	}
	public void triangle_Three() {
		
	}
	
	/*
	 * 0000  0  0    4
	 * _000  1  1    3
	 * __00  2  2    2
	 * ___0  3  3    1
	 *       i (i) (4-i) 
	 */
	public void triangle_Four() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("　");
			}// 공백 for
			for (int j = 0; j < (4-i); j++) {
				System.out.print("＠");
			}// 그림 for
			System.out.println();
		} // 층수 for
	}
	
}










